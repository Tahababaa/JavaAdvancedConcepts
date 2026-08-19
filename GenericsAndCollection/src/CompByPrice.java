import java.util.Comparator;

public class CompByPrice<T extends Items> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
