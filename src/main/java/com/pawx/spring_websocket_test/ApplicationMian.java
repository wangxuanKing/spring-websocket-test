package com.pawx.spring_websocket_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pawx")
public class ApplicationMian {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationMian.class, args);
	}
}
