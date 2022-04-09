package az.et.part01.lesson02.class_code.oop;

public class UserStatusByClass {
    private String status; // instance variable

    public UserStatusByClass(String status) {
        this.status = status;
    }

    public UserStatusByClass active = new UserStatusByClass("active");
    public UserStatusByClass inactive = new UserStatusByClass("inactive");
    public UserStatusByClass banned = new UserStatusByClass("banned");

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
