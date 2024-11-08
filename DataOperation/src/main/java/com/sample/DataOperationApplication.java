package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.sample.model")
public class DataOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataOperationApplication.class, args);
	}

}
