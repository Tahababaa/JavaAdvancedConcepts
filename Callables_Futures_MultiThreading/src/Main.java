import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Task t1=new Task(25);
        Task t2 =new Task(12);

        ExecutorService ex = Executors.newFixedThreadPool(2);

        System.out.println("Hello 1");

        Future<Integer> f = ex.submit(t1);

        System.out.println("Hello, I am back");// this will be shown instantly due to multithreading
        Future<Integer> f2 = ex.submit(t2);


        int val = f.get();
        System.out.println(val);

        int val2 = f2.get();
        System.out.println(val2);//if we reduce thread to 1, both will take 10 seconds separately


        ex.shutdown();

    }
}