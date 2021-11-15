package be.intecbrussel.springdatademo;

import be.intecbrussel.springdatademo.model.User;
import be.intecbrussel.springdatademo.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataDemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx =
        SpringApplication.run(SpringDataDemoApplication.class, args);

        UserRepository repository = ctx.getBean(UserRepository.class);
        System.out.println(repository);

        User user =new User();
        user.setLogin("Nog rap");
        User saved = repository.save(user);
        System.out.println("Saved user: " + saved.toString());
    }

}
