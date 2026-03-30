class InvalidBookingException extends Exception {
    InvalidBookingException(String msg) {
        super(msg);
    }
}

public class UseCase9ErrorHandlingValidation {
    public static void main(String[] args) {
        try {
            throw new InvalidBookingException("Invalid Room");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}