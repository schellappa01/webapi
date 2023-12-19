package com.boot.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebapiApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to web API";
	}
	public static void main(String[] args) {
		SpringApplication.run(WebapiApplication.class, args);
	}

}
