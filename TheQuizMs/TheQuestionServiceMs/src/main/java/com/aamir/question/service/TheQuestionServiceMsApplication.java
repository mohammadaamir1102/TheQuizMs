package com.aamir.question.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class TheQuestionServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheQuestionServiceMsApplication.class, args);
	}

}
