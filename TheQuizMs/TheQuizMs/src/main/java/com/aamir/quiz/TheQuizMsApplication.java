package com.aamir.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TheQuizMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheQuizMsApplication.class, args);
	}

}
