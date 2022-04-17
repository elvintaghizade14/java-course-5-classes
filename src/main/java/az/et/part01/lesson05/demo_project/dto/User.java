package az.et.part01.lesson05.demo_project.dto;

import com.google.common.base.Objects;

public class User {
    private String fullName;
    private String email;
    private String password;
    private int age;

    public User(String fullName, String email, String password, int age) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equal(fullName, user.fullName)
                && Objects.equal(email, user.email)
                && Objects.equal(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fullName, email, password, age);
    }

    @Override
    public String toString() {
        return String.format("User{fullName='%s', email='%s', password='%s', age=%d}",
                fullName, email, password, age);
    }
}
