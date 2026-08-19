import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(5);

        for(int i=1;i<=100000;i++){
            Task t1 = new Task(i);
            ex.submit(t1);

        }
        ex.shutdown();

    }
}