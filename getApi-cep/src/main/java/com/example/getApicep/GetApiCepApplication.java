package com.example.getApicep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GetApiCepApplication {
	
	 @Bean
	 public RestTemplate getRestTemplate() {
		 
		 return new RestTemplate();
	 }
	 
	public static void main(String[] args) {
		SpringApplication.run(GetApiCepApplication.class, args);
		
	}
	
	
}
	
	


