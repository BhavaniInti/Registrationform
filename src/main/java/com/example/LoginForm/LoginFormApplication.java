package com.example.LoginForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.LoginForm.Controller","Entity","Repository","Service"})
@EntityScan(basePackages = "Entity")
@EnableJpaRepositories(basePackages = "Repository")
public class LoginFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginFormApplication.class, args);
	}

}
