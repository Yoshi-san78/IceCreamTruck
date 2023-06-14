package java.Guillaume.project;

public class ShavedIce extends FoodItem {
    private String syrup;

    public ShavedIce(String name, double price, String syrup) {
        super(name, price);
        this.syrup = syrup;
    }

    public String getSyrup() {
        return syrup;
    }
}
