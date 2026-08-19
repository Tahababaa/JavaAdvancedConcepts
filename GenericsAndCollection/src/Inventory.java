import java.util.*;

public class Inventory <T extends Items>{
    private HashMap<String,T> items;

    public Inventory(){
        items=new HashMap<>();

    }
    public void addItem(T item){
        items.put(item.getId(),item);
        System.out.println("Item added successfully");
    }
    public void removeItem(String id){
        items.remove(id);
        System.out.println("Item removed!");
    }
    public T getItem(String id){
        return items.get(id);
    }
    public Collection<T> getAllItems(){
        return items.values();

    }
    public List<T> filterByPriceRange(double minPrice, double maxPrice){
        List<T> result = new ArrayList<>();
        for(T item:items.values()){
            if(item.getPrice()>=minPrice && item.getPrice()<=maxPrice){
                result.add(item);
            }
        }
        return result;
    }
    public List<T> filterByAvailability(){
        List<T> result = new ArrayList<>();
        for(T item:items.values()){
            if(item.getQuantity()>0){
                result.add(item);
            }
        }
        return result;
    }
    public List<T> sortByPrice() {

        List<T> result = new ArrayList<>(items.values());

        result.sort(new CompByPrice<>());

        return result;
    }

    public List<T> sortByQuantity() {

        List<T> result = new ArrayList<>(items.values());

        result.sort(new CompByQuant<>());

        return result;
    }


}
