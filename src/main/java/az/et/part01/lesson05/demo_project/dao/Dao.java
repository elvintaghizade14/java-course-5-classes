package az.et.part01.lesson05.demo_project.dao;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public interface Dao<T> {

    T save(T t);

    void delete(T t);

    Collection<T> findAll();

    Optional<T> findById(int id);

    Optional<T> findBy(Predicate<T> predicate);

    Collection<T> findAllBy(Predicate<T> predicate);

}
