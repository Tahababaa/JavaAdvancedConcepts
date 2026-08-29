import java.util.Comparator;

public class Order <T extends Product>  {
    private String orderId;
    private T product;
    private int quantity;
    private boolean express;

    public Order(String orderId,T product,int quantity,boolean express){
        this.orderId = orderId;
        this.product=product;
        this.quantity=quantity;
        this.express=express;


    }

    public T getProduct() {
        return product;
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean isExpress() {
        return express;
    }

    public int getQuantity() {
        return quantity;
    }
    public double getTotalPrice(T product){
        return product.getPrice()*quantity;
    }


}
