package com.example.helloservice;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloServiceApplication {
	 private static final Logger LOG =
			 Logger.getLogger(
					 HelloServiceApplication.class.getName());

	   
	 
	
	@GetMapping("/message")
	public String getMEssage(){
	
		LOG.log(Level.INFO, "Getting Messages at :",new Date());
		LOG.log(Level.WARNING, "Getting Messages at :",new Date());
		LOG.log(Level.SEVERE, "Getting Messages at :",new Date());
		
	      
		
		
		return "Hello Students!!!";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
	}

}

