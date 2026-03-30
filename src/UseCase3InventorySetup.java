import java.util.*;

public class UseCase3InventorySetup {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);

        System.out.println("Inventory: " + inventory);
    }
}