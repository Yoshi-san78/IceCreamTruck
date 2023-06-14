package java.Guillaume.project;

import java.util.HashMap;
import java.util.Map;

public class IceCreamTruck {
    private Map<FoodItem, Integer> inventory;
    private double totalRevenue;

    public IceCreamTruck() {
        inventory = new HashMap<>();
        totalRevenue = 0.0;
    }

    public void addItem(FoodItem item, int quantity) {
        inventory.put(item, quantity);
    }

    public void sellItem(FoodItem item, int quantity) {
        if (inventory.containsKey(item)) {
            int availableQuantity = inventory.get(item);
            if (quantity <= availableQuantity) {
                double totalPrice = item.getPrice() * quantity;
                totalRevenue += totalPrice;
                inventory.put(item, availableQuantity - quantity);
                System.out.println("ENJOY!");
            } else {
                System.out.println("SO SORRY!");
            }
        } else {
            System.out.println("SO SORRY!");
        }
    }

    public Map<FoodItem, Integer> getInventory() {
        return inventory;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }
}
