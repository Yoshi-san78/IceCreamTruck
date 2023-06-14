package java.Guillaume.project;

import java.util.Map;

public class IceCreamTruckAPI {
    private IceCreamTruck iceCreamTruck;

    public IceCreamTruckAPI() {
        iceCreamTruck = new IceCreamTruck();
        initializeInventory();
    }

    private void initializeInventory() {
        // Ice Creams
        IceCream chocolateIceCream = new IceCream("Chocolate Ice Cream", 250, "Chocolate");
        IceCream strawberryIceCream = new IceCream("Strawberry Ice Cream", 250, "Strawberry");
        // Shaved Ice
        ShavedIce mangoShavedIce = new ShavedIce("Mango Shaved Ice", 300, "Mango");
        // Snacks
        Snack chips = new Snack("Chips", 100);

        iceCreamTruck.addItem(chocolateIceCream, 5);
        iceCreamTruck.addItem(strawberryIceCream, 3);
        iceCreamTruck.addItem(mangoShavedIce, 2);
        iceCreamTruck.addItem(chips, 10);
    }

    public void purchaseItem(FoodItem item, int quantity) {
        iceCreamTruck.sellItem(item, quantity);
    }

    public Map<FoodItem, Integer> getInventory() {
        return iceCreamTruck.getInventory();
    }

    public double getTotalRevenue() {
        return iceCreamTruck.getTotalRevenue();
    }
}
