package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "entity")
@ComponentScan(basePackages = {"controller", "entity", "repository", "service"})
@EnableJpaRepositories(basePackages = "repository")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
			
			var welcomeMessage = new WelcomeMessage();
			System.out.println(welcomeMessage.getWelcomeMessage());
			
			
		}
	
	}