package az.et.part01.lesson05.demo_project.service;

public interface UserService<T> {
    String register(T t);

    String login(T t);

    String logout(T t);

    String changePassword(T t);

    String changeEmail(T t);

    String changePhone(T t);
}
