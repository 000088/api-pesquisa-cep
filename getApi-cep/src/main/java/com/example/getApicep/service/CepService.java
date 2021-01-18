package com.example.getApicep.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.getApicep.model.Cep;

public class CepService {
	
	
	public void pesquisaCep() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		String url ="https://viacep.com.br/ws/40394050/json/";
		
		ResponseEntity<Cep[]> responseEntity= restTemplate.getForEntity(url, Cep[].class);
		
		MediaType contType = responseEntity.getHeaders().getContentType();
		
		HttpStatus statusCode = responseEntity.getStatusCode();
		
		
		
	}

}
