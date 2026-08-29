public class Product implements Comparable<Product>{
    private String productId;
    private String name;
    private double price;
    private static int idmaker=10000;
    private static int counter;

    public Product(String name,double price){
        this.productId=
        this.name=name;
        this.price=price;
        counter++;
        idmaker++;
    }

    private String setId(){
        return "HSH00"+idmaker;
    }
    @Override
    public String toString(){
        return "Product ID: " +productId +
                "Name: "+ name +
                "Price: " + price;
    }
    @Override
    public int compareTo(Product o){ //natural ordering

        return Double.compare(this.price,o.price);

    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }
}
