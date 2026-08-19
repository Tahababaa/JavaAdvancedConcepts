import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        Items i1 = new Book("B1","DOS",299,12,"Mr Kim");
        Items i2 = new Electronics("E1","Floppy Disk",1499,15,3);
        Items i3 = new Book("B2","C++",499,2,"Mr John");
        Items i4 = new Clothing("C1","T-Shirt",699,100,"M");
        Items i5 = new Electronics("E2","C-Charger",2799,32,1);
        Items i6 = new Clothing("C2","Track Pants",799,89,"XL");
        Items i7 = new Book("B3","Java for none",999,0,"Mr Sugar");

        List<Items> l1 = new ArrayList<>(List.of(i1,i2,i3,i4,i5,i6,i7));

        Collections.sort(l1);
        System.out.println(l1);


        OrderQueue orderQueue = new OrderQueue();

        orderQueue.addOrder(new Order("ORD-101", false));
        orderQueue.addOrder(new Order("ORD-102", true));
        orderQueue.addOrder(new Order("ORD-103", false));
        orderQueue.addOrder(new Order("ORD-104", true));
        orderQueue.addOrder(new Order("ORD-105", false));

        System.out.println(orderQueue.processOrder());
        System.out.println(orderQueue.processOrder());
        System.out.println(orderQueue.processOrder());
        System.out.println(orderQueue.processOrder());
        System.out.println(orderQueue.processOrder());

        Inventory<Items> inventory = new Inventory<>();

        inventory.addItem(new Items("12", "Laptop", 80000, 5));
        inventory.addItem(new Items("21", "Mouse", 1000, 20));
        inventory.addItem(new Items("22", "Keyboard", 3000, 0));
        inventory.addItem(new Items("41", "Monitor", 25000, 3));

        List<Items> sortedByPrice = inventory.sortByPrice();

        for (Items item : sortedByPrice) {
            System.out.println(item.getName() + " " + item.getPrice());
        }

        List<Items> sortedByQuantity = inventory.sortByQuantity();

        for (Items item : sortedByQuantity) {
            System.out.println(item.getName() + " " + item.getQuantity());
        }

        List<Items> affordable = inventory.filterByPriceRange(1000, 30000);
        for (Items item : affordable) {
            System.out.println(item.getName() + " " + item.getPrice());
        }

        List<Items> available = inventory.filterByAvailability();
        for (Items item : available) {
            System.out.println(item.getName() + " " + item.getQuantity());
        }

        Customer customer = new Customer("C1", "Taha");

        Items laptop1 = new Items("101", "Laptop", 80000, 5);
        Items laptop2 = new Items("101", "Laptop", 80000, 5);

        customer.addToWishlist(laptop1);
        customer.addToWishlist(laptop2);

        System.out.println(customer.getWishlist().size());



    }
}