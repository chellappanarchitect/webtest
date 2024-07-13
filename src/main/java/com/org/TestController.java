package com.org;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
	
	@GetMapping("/data")
	public String getData() {
		return "Frist message from AWS Ecs";
	}
	
	@GetMapping("/message")
	public String getMessage() {
		return "second message from AWS Ecs";
	}
}
