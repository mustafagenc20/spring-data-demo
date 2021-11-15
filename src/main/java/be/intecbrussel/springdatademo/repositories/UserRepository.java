package be.intecbrussel.springdatademo.repositories;

import be.intecbrussel.springdatademo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
