import java.util.Comparator;

public class OrderComparator<T extends Product> implements Comparator<Order<T>> {
    @Override
    public int compare(Order<T> o1, Order<T> o2) {
        if(o1.isExpress() && !o2.isExpress()){
            return -1;
        }
        if(!o1.isExpress() && o2.isExpress()){
            return 1;
        }
        return o1.getOrderId().compareTo(o2.getOrderId());
    }
}
