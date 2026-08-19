import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Callable<Integer> {
    private int num;
    public Task(int num){
        this.num=num;
    }
    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        return 10*num;
        ExecutorService ex = Executors.newCachedThreadPool();

    }
}
