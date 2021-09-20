package com.example.wttech.basicrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class BasicRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicRestApiApplication.class, args);
	}

}
