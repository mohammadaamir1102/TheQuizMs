package com.aamir.quiz.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TheQuizServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheQuizServiceRegistryApplication.class, args);
	}

}
