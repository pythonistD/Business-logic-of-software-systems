package cheboksarov.blps_lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlpsLab1Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BlpsLab1Application.class);
		//app.setAdditionalProfiles("helios");
		app.run(args);
	}

}
