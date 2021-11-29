package com.REST.REST_TEST;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RESTController {
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello");
		return "Hello REST";
	}
}
