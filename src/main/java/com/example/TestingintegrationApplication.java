package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingintegrationApplication {
	
	public void addData(String data) {
		
		System.out.println("Thsi is a demo of git");
		
		if (data.equals("Java ")) {
			System.out.println("This is inside if statement");
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(TestingintegrationApplication.class, args);
	}

}
