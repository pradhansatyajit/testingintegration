package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingintegrationApplication {
	
	public void addData(String data) {
		
		//System.out.println("Thsi is a demo of git");
		
		if (data.equals(VariableConstants.DATA_INPUT)) {
			System.out.println("data is same as " + VariableConstants.DATA_INPUT);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(TestingintegrationApplication.class, args);
	}

}
