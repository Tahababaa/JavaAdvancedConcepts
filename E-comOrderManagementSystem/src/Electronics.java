public class Electronics extends Product {
    private int warrantyMonths;
    private String brand;

    public Electronics(String name, double price, int warrantyMonths, String brand){
        super(name,price);
        this.warrantyMonths=warrantyMonths;
        this.brand = brand;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
