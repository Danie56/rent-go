package com.example.ren.go;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
public class RenGoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenGoApplication.class, args);
	}

}
