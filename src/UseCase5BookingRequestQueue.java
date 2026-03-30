import java.util.*;

public class UseCase5BookingRequestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Single");
        queue.add("Double");

        System.out.println(queue);
    }
}