package java.Guillaume.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class IceCreamTruckAPITest {
    private IceCreamTruckAPI iceCreamTruckAPI;

    @BeforeEach
    public void setUp() {
        iceCreamTruckAPI = new IceCreamTruckAPI();
    }

    @Test
    public void testPurchaseItem_SuccessfulPurchase() {
        FoodItem iceCream = new IceCream("Vanilla Ice Cream", 250, "Vanilla");
        int quantity = 2;

        iceCreamTruckAPI.purchaseItem(iceCream, quantity);

        Map<FoodItem, Integer> inventory = iceCreamTruckAPI.getInventory();
        int updatedQuantity = inventory.get(iceCream);

        Assertions.assertEquals(quantity, updatedQuantity);
    }

    @Test
    public void testPurchaseItem_InsufficientQuantity() {
        FoodItem iceCream = new IceCream("Strawberry Ice Cream", 250, "Strawberry");
        int quantity = 10;

        iceCreamTruckAPI.purchaseItem(iceCream, quantity);

        Map<FoodItem, Integer> inventory = iceCreamTruckAPI.getInventory();
        int availableQuantity = inventory.get(iceCream);

        Assertions.assertTrue(availableQuantity < quantity);
    }

    @Test
    public void testGetTotalRevenue() {
        FoodItem iceCream = new IceCream("Chocolate Ice Cream", 250, "Chocolate");
        int quantity = 3;

        iceCreamTruckAPI.purchaseItem(iceCream, quantity);
        double totalRevenue = iceCreamTruckAPI.getTotalRevenue();

        double expectedRevenue = iceCream.getPrice() * quantity;
        Assertions.assertEquals(expectedRevenue, totalRevenue);
    }
}
