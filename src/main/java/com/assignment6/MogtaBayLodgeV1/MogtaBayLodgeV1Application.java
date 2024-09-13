package com.assignment6.MogtaBayLodgeV1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class MogtaBayLodgeV1Application {

	public static void main(String[] args) {
		SpringApplication.run(MogtaBayLodgeV1Application.class, args);
	}

}
