package be.intecbrussel.springdatademo.repositories;

import be.intecbrussel.springdatademo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByLoginContaining(String s);
    List<User> findByLoginStartingWith(String s);
    List<User> findByIdGreaterThan(Integer id);
    List<User> findByLoginContainingAndIdGreaterThan(String name, Integer id);
}
