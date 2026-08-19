import java.util.Comparator;

public class CompByQuant<T extends Items> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getQuantity(),o2.getQuantity());
    }
}
