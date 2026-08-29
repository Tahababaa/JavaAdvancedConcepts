import java.util.*;

public class OrderManager <T extends Product>  {

    private List<Order<T>> orders;
    private PriorityQueue<Order<T>> pq;

    public OrderManager(){
        orders=new ArrayList<>();
        pq=new PriorityQueue<>(new OrderComparator<>());
    }
    public void addOrder(Order <T> order){
        orders.add(order);
        pq.offer(order);
    }
    public void processOrder(){
        pq.poll();
    }
    public List<Order<T>> getOrdersSortedByPrice(){
        return Collections.sort();
    }

}
