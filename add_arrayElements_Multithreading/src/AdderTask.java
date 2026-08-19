import java.util.List;
import java.util.concurrent.Callable;

public class AdderTask implements Callable<Long> {
    private final int[] arr;
    private final int start;
    private final int end;

    public AdderTask(int [] arr, int start, int end){
        this.arr=arr;
        this.start=start;
        this.end=end;
    }
    @Override
    public Long call(){
        long sum =0;

        for(int i =start;i<end;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
