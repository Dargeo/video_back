package aav.spring.video_back.videoGameBack;
import aav.spring.video_back.videoGameBack.domain.Role;
import aav.spring.video_back.videoGameBack.domain.User;
import aav.spring.video_back.videoGameBack.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class VideoGameBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoGameBackApplication.class, args);




	}
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}


	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRol(new Role(1,"ROLE_USER"));




			userService.saveUser(new User(1,"John","john","john@test.com","1234",new ArrayList<>()));

			userService.addRoleToUser("john","ROLE_USER");
		};
	}

}
