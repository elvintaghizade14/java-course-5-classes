package az.et.part01.lesson05.demo_project.dao;

import az.et.part01.lesson05.demo_project.dto.User;
import java.sql.DriverManager;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public class PostgresUserDao implements UserDao {
    @Override
    public User save(User user) {
//        DriverManager.getConnection()
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public Collection<User> findAll() {
        return null;
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
