import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int [] arr= new int[1000000];
        Arrays.fill(arr, 1);

        ExecutorService executor = Executors.newFixedThreadPool(4);

        int chunk=arr.length/4;

        Future<Long> f1 = executor.submit(new AdderTask(arr,0,chunk));
        Future<Long> f2 = executor.submit(new AdderTask(arr,chunk,2*chunk));
        Future<Long> f3 = executor.submit(new AdderTask(arr,2*chunk,3*chunk));
        Future<Long> f4 = executor.submit(new AdderTask(arr,3*chunk,4*chunk));

        long total = f1.get()+f2.get()+f3.get()+f4.get();

        System.out.println("Total sum: "+total);

        executor.shutdown();




    }
}