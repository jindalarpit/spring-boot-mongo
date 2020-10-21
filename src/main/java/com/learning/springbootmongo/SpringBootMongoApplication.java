package com.learning.springbootmongo;

import com.learning.springbootmongo.entity.User;
import com.learning.springbootmongo.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoApplication.class, args);
	}

    @Bean
    ApplicationRunner init(UserRepository repository) {

        User u1 = new User(1l, "Sachin", "Tendulkar", "sachin.tendulkar@gmail.com");
        User u2 = new User(2l, "Saurav", "Ganguly", "saurav.ganguly@gmail.com");
        User u3 = new User(3l, "Rahul", "Dravid", "rahul.dravid@gmail.com");

        List<User> users = Arrays.asList(u1, u2, u3);
        return args -> {
            repository
                    .deleteAll();
            repository
                    .saveAll(users);
        };
    }
}
