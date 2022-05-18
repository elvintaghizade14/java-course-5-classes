package az.et.springdataintro.exception;

public class PersonAlreadyExistsException extends RuntimeException {
    private String message;

    public PersonAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
}
