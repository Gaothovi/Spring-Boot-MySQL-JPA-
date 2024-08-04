	package com.example.spring_boot;
	
	import org.springframework.boot.SpringApplication;
	
	
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	
	import org.springframework.context.annotation.ComponentScan;
	
	@SpringBootApplication
	@ComponentScan(basePackages=("com.example.spring_boot.controller"))
	public class Application {
	
		public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
			
			var welcomeMessage = new WelcomeMessage();
			System.out.println(welcomeMessage.getWelcomeMessage());
			
			
		}
	
	}