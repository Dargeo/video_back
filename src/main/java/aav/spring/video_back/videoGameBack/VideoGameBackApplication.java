package aav.spring.video_back.videoGameBack;

import aav.spring.video_back.videoGameBack.services.VideoGameService;
import aav.spring.video_back.videoGameBack.services.implementations.VideoGameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VideoGameBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoGameBackApplication.class, args);




	}

}
