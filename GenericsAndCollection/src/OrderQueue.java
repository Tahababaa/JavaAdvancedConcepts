import java.util.PriorityQueue;

public class OrderQueue {
    private PriorityQueue<Order> orders;
    public OrderQueue(){
        orders = new PriorityQueue<>();
    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public Order processOrder(){
        return orders.poll();
    }


}
