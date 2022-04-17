package az.et.part01.lesson05.demo_project.controller;

import az.et.part01.lesson05.demo_project.dto.User;
import az.et.part01.lesson05.demo_project.service.UserService;
import java.util.regex.Pattern;

public class UserControllerImpl implements UserController<User> {
    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }


    @Override
    public String register(User user) {
        if (user == null || user.getEmail() == null || user.getPassword() == null) {
            throw new IllegalArgumentException("Invalid user input");
            // ...
            // ...
            // ...
        }
        if (Pattern.matches(" /^[a-zA-Z0-9.! #$%&'*+/=? ^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\. [a-zA-Z0-9-]+)*$/.",
                user.getEmail())) {
            throw new IllegalArgumentException("Invalid email");
        }
        userService.register(user);
        return null;
    }

    @Override
    public String login(User user) {
        return null;
    }

    @Override
    public String logout(User user) {
        return null;
    }

    @Override
    public String changePassword(User user) {
        return null;
    }

    @Override
    public String changeEmail(User user) {
        return null;
    }

    @Override
    public String changePhone(User user) {
        return null;
    }
}
