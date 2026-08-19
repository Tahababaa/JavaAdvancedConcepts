import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService ex = Executors.newFixedThreadPool(8);
        List<Integer> list = Arrays.asList(8,3,4,5,1,5,7,0);
        Sorter task = new Sorter(list,ex); //using the same executor service for all34wqasedr5t67y8u9io0p[]
        Future<List<Integer>> f1 = ex.submit(task);
        List<Integer> sorted = f1.get();

        System.out.println(sorted);

        ex.shutdown();
    }
}