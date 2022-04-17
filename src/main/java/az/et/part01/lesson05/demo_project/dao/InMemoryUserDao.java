package az.et.part01.lesson05.demo_project.dao;

import az.et.part01.lesson05.demo_project.dto.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class InMemoryUserDao implements UserDao {
    public static final List<User> USERS = new ArrayList<>(
            Arrays.asList(
                    new User("John Smith", "John", "Doe", 20),
                    new User("Jane Doe", "Jane", "Doe", 30),
                    new User("Jack Black", "Jack", "Black", 40),
                    new User("Jack White", "Jack", "White", 50)
            )
    );


    @Override
    public User save(User user) {
        USERS.add(user);
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public Collection<User> findAll() {
        return USERS;
    }

    @Override
    public Optional<User> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findBy(Predicate<User> predicate) {
        return Optional.empty();
    }

    @Override
    public Collection<User> findAllBy(Predicate<User> predicate) {
        return null;
    }
}
