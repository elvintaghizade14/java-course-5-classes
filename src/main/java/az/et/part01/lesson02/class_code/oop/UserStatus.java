package az.et.part01.lesson02.class_code.oop;

public enum UserStatus {
    ACTIVE(0, "Active"),
    INACTIVE(1, "Inactive"),
    BANNED(2, "Banned");

    private final int id;
    private final String status;

    UserStatus(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}

final class US {
    public static final String ACTIVE = "ACTIVE";

    private US() {
        throw new AssertionError();
    }

}

class Runner{
    public static void main(String[] args) {
        System.out.println(UserStatus.ACTIVE.getStatus());
        System.out.println(US.ACTIVE);
    }
}