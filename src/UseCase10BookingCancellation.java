import java.util.*;

public class UseCase10BookingCancellation {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("R1");

        System.out.println("Cancelled: " + stack.pop());
    }
}