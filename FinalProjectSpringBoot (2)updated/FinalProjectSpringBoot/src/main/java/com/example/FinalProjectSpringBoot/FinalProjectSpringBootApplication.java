package com.example.FinalProjectSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class FinalProjectSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectSpringBootApplication.class, args);
	}

}
