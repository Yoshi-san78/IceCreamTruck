import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public static void main(String[] args) {
        IceCreamTruckAPI iceCreamTruckAPI = new IceCreamTruckAPI();

        // Purchase example (IceCreamTruckAPI)
        iceCreamTruckAPI.purchaseItem(new IceCream("Chocolate Ice Cream", 250, "Chocolate"), 2);
        iceCreamTruckAPI.purchaseItem(new ShavedIce("Mango Shaved Ice", 300, "Mango"), 3);
        iceCreamTruckAPI.purchaseItem(new Snack("Chips", 100), 5);

        // Get inventory example (IceCreamTruckAPI)
        Map<FoodItem, Integer> inventory = iceCreamTruckAPI.getInventory();
        for (Map.Entry<FoodItem, Integer> entry : inventory.entrySet()) {
            FoodItem item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(item.getName() + ": " + quantity);
        }

        // Get total revenue example (IceCreamTruckAPI)
        double totalRevenue = iceCreamTruckAPI.getTotalRevenue();
        System.out.println("Total : ¥" + totalRevenue);
    }