import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;

    public Consumer(Store store, Semaphore producerSema, Semaphore consumerSema){
        this.store=store;
        this.consumerSema=consumerSema;
        this.producerSema=producerSema;

    }

    @Override
    public void run(){
        while(true){
            try {
                consumerSema.acquire(); // consumer --,
                store.removeItems(); // item consumed by consumer from store
                producerSema.release(); // signaling producer that one space is now available, producer++
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
