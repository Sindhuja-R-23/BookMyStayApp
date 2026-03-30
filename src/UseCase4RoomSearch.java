import java.util.*;

public class UseCase4RoomSearch {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 2);
        inventory.put("Double", 0);
        inventory.put("Suite", 1);

        for (String type : inventory.keySet()) {
            if (inventory.get(type) > 0) {
                System.out.println(type + " Available");
            }
        }
    }
}