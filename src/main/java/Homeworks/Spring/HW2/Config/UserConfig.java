package Homeworks.Spring.HW2.Config;

import Homeworks.Spring.HW2.Users.User;
import Homeworks.Spring.HW2.Users.UserRepository;
import Homeworks.Spring.HW2.Users.UserRepositoryImpl;
import Homeworks.Spring.HW2.servise.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Homeworks.Spring.HW2")
public class UserConfig {
    @Bean
    public User user(){
        return new User(1, "Mike", "Mike123@gmail.com");
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }

    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }
}
