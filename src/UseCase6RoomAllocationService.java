import java.util.*;

public class UseCase6RoomAllocationService {
    public static void main(String[] args) {
        HashSet<String> allocated = new HashSet<>();

        allocated.add("Single-1");
        allocated.add("Single-2");

        System.out.println("Allocated: " + allocated);
    }
}