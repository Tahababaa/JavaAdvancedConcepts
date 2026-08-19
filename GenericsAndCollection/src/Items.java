public class Items implements Comparable<Items>{
    private String id;
    private int quantity;
    private double price;
    private String name;

    public Items(String id, String name, double price, int quantity){
        this.id=id;
        this.name=name;
        this.price= price;
        this.quantity=quantity;
    }

    @Override
    public int compareTo(Items o) {

        return this.name.compareTo(o.name);
    }

//    updating toSting() to print items

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
