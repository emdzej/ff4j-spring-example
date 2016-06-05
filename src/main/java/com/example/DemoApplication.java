package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("application-context.xml")
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(DemoApplication.class, args);
	}
}
