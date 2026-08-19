import java.util.HashSet;
import java.util.Set;

public class Customer {
    private String customerId;
    private String name;
    private Set<Items> wishlist;

    public Customer(String customerId,String name){
        this.customerId=customerId;
        this.name=name;
        wishlist = new HashSet<>();
    }
    public void addToWishlist(Items item){
        wishlist.add(item);
    }
    public void removeFromWishlist(Items item){
        wishlist.remove(item);

    }
    public Set<Items> getWishlist() {
        return wishlist;
    }
}
