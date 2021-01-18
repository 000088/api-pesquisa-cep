package com.example.getApicep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.getApicep.model.Cep;

@RestController
@RequestMapping("/api")
public class PesqCep {
	
	
   @Autowired
   RestTemplate restTemplate;    //usando RestTemplate para fazer requisições http na API
	
   @GetMapping(path = "/findCep/{cep}", produces=MediaType.APPLICATION_JSON_VALUE)
   @CrossOrigin
   public Cep findCep(@PathVariable(value = "cep") String cep){  //endpoint que recebe uma string contendo o cep para ser pesquisado
	   
	StringBuilder builder = new StringBuilder("https://viacep.com.br/ws/");   //acessando API publica para consulta de cep
	builder.append(cep);
	builder.append("/json");
	RestTemplate restTemplate = new RestTemplate();
	String url =builder.toString(); //String com url completa para pesquisar cep
	Cep responseEntity= restTemplate.getForEntity(url,Cep.class).getBody();
	System.out.println(responseEntity);
	
	    return responseEntity; //retorna JSON
	}

 }