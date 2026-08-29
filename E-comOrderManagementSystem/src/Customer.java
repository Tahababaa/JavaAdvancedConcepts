import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<Order<?>> orders;

    public Customer(String customerId,String name){
        this.customerId=customerId;
        this.name=name;
        orders = new ArrayList<>();
    }
    public void addorder(Order<?> order){
        orders.add(order);
    }

    public List<Order<?>> getOrders() {
        return orders;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}
