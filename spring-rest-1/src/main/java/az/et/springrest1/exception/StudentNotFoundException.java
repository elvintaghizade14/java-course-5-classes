package az.et.springrest1.exception;

public class StudentNotFoundException extends RuntimeException {
    private String message;

    public StudentNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
