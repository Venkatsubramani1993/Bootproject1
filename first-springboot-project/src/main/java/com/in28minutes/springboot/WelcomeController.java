package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@Autowired
	private WelcomeService service;

	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("Test");
		return service.retrieveWelcomeMessage();
	}
}

@Component
class WelcomeService {
	public String retrieveWelcomeMessage() {
		// Complex Method
		return "Hai good Morning!";

	}
}