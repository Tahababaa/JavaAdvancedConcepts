import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arr;
    private ExecutorService executor;

    public Sorter(List<Integer> arr,ExecutorService executor){
        this.arr=arr;
        this.executor=executor;
    }
    @Override
    public List<Integer> call() throws Exception{
        if(arr.size()==1){
            return arr;
        }

        int mid = arr.size()/2;

        List<Integer> left = new ArrayList<>(arr.subList(0,mid));
        List<Integer> right = new ArrayList<>(arr.subList(mid,arr.size()));

        Sorter leftTask = new Sorter(left,executor);
        Sorter rightTask = new Sorter(right,executor);

        Future<List<Integer>> leftFuture = executor.submit(leftTask);
        Future<List<Integer>> rightFuture = executor.submit(rightTask);

        List<Integer> leftSorted = leftFuture.get();
        List<Integer> rightSorted = rightFuture.get();

        return merge(leftSorted,rightSorted);

    }
    public List<Integer> merge(List<Integer> left, List<Integer> right){
        List<Integer> result = new ArrayList<>();
        int i=0,j=0;
        while(i<left.size() && j<right.size()){
            if(left.get(i)<=right.get(j)){
                result.add(left.get(i));
                i++;
            }
            else{
                result.add(right.get(j));
                j++;
            }
        }
        while(i<left.size()){
            result.add(left.get(i));
            i++;
        }
        while(j<right.size()){
            result.add(right.get(j));
            j++;
        }
        return result;
    }



}
