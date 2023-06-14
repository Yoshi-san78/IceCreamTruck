package java.Guillaume.project;

public class IceCream extends FoodItem {
    private String flavor;

    public IceCream(String name, double price, String flavor) {
        super(name, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
