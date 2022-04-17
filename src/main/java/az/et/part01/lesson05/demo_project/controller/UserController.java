package az.et.part01.lesson05.demo_project.controller;

public interface UserController<T> {
    String register(T t);

    String login(T t);

    String logout(T t);

    String changePassword(T t);

    String changeEmail(T t);

    String changePhone(T t);

}
