package com.dafobe.learning.springboot.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	
	
	@RequestMapping("/")
	public String index() {
		LOGGER.debug("displaying default request mapping HELLO WORLD");
		return "Hello World : First Spring Boot Tests";
	}
}
