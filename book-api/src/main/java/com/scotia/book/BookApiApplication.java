package com.scotia.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BookApiApplication {


	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}

}
