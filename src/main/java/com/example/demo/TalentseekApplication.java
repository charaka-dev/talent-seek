package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@EntityScan
@SpringBootApplication
@RestController
@RequestMapping(value = "/api")
public class TalentseekApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalentseekApplication.class, args);
	}


	@RequestMapping(path = "/save" , method = RequestMethod.GET)
	public String post(){
		return "Success";
	}
}
