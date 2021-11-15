package be.intecbrussel.springdatademo;

import be.intecbrussel.springdatademo.model.User;
import be.intecbrussel.springdatademo.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

@SpringBootApplication
public class SpringDataDemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx =
        SpringApplication.run(SpringDataDemoApplication.class, args);

        UserRepository repository = ctx.getBean(UserRepository.class);
        System.out.println(repository);

        repository.save(new User("Jan"));
        repository.save(new User("Piet"));
        repository.save(new User("Joris"));
        repository.save(new User("Korneel"));
        repository.save(new User("Jacoba"));
        repository.save(new User("Felicia"));

        UserRepository userRepository = ctx.getBean(UserRepository.class);
        userRepository.findByLoginContaining("Ja").forEach(user -> System.out.println(user.toString()));

//        userRepository.findAll(Example.of())

    }

}
