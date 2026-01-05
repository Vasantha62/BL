

public class HotelReservationException extends Exception {  // can be RuntimeException too

    // Nested enum for exception types
    public enum ExceptionType {
        INVALID_DATE,
        INVALID_CUSTOMER_TYPE
    }

    private ExceptionType type;

    // Constructor
    public HotelReservationException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public ExceptionType getType() {
        return type;
    }
}
