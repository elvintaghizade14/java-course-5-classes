package az.et.springdataintro.exception;

public class ParameterInvalidException extends RuntimeException {
    private String message;

    public ParameterInvalidException(String message) {
        super(message);
        this.message = message;
    }
}
