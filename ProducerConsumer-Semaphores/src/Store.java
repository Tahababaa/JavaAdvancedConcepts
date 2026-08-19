import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {

    private int maxSize;
    private List<Object> items;
    private Lock lock = new ReentrantLock();

//    constructor
    public Store(int maxSize){
        this.maxSize=maxSize;
        this.items = new ArrayList<>(maxSize);
    }
    public int getMaxSize(){
        return maxSize;
    }
    public void setMaxSize(int maxSize){
        this.maxSize=maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItems(Object item){
        lock.lock();
        items.add(item);
        System.out.println("Producer has added an item. Size of items: " +items.size());
        lock.unlock();
    }
    public void removeItems(){
        lock.lock();
        items.removeLast();
        System.out.println("Consumer has consumed. Size of items: " +items.size());
        lock.unlock();
    }
}
