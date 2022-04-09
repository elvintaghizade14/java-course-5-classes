package az.et.part01.lesson02.class_code.oop;

public enum ErrorCode {
    USER_NOT_FOUND(ParentErrorCode.NOT_FOUND, 40400, "User not found"),
    PRODUCT_NOT_FOUND(ParentErrorCode.NOT_FOUND, 40401, "Product not found");

    private final ParentErrorCode parentErrorCode;
    private final int errorCode;
    private final String errorMessage;

    ErrorCode(ParentErrorCode parentErrorCode, int errorCode, String errorMessage) {
        this.parentErrorCode = parentErrorCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ParentErrorCode getParentErrorCode() {
        return parentErrorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

enum ParentErrorCode {
    NOT_FOUND(404);

    private final int code;

    ParentErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}