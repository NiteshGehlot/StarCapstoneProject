package com.starhealth.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties(prefix = "application.properties")
public class EcommerceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EcommerceApplication.class, args);
		
	}

}
