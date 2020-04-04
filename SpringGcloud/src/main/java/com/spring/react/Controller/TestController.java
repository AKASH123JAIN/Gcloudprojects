package com.spring.react.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String MessageService() {
		
		return "Hi , This is response from Akash App..";
	}
	
}
