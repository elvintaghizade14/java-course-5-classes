package az.et.part01.lesson05.demo_project.service;

import az.et.part01.lesson05.demo_project.dao.Dao;
import az.et.part01.lesson05.demo_project.dto.User;
import java.util.Optional;
import java.util.function.Predicate;

public class UserServiceImpl implements UserService<User> {
    private final Dao userDao;

    public UserServiceImpl(Dao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String register(User newUser) {
        Optional<User> userByEmail = userDao.findBy((Predicate<User>) user -> user.getEmail().equals(newUser.getEmail()));
        if (userByEmail.isPresent()) {
            throw new IllegalArgumentException("User with this email already exists");
        }
        userDao.save(newUser);
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
