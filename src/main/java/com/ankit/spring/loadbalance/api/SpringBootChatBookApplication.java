package com.ankit.spring.loadbalance.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/chart-application")
public class SpringBootChatBookApplication {
	@Value("${server.port}")
	String port;
	
	@GetMapping("/chatbox")
	public String showChat(){
		return "welcome to chat box " +port;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootChatBookApplication.class, args);
	}

}

