package com.dafobe.learning.springboot.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dafobe.learning.springboot.model.entities.Item;
import com.dafobe.learning.springboot.services.TestServices;


@RestController
@RequestMapping("/test")
public class HelloWorldController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	
	@Autowired
	private TestServices testServices;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Item> findAll() {
		LOGGER.debug("displaying default request mapping HELLO WORLD");
		return testServices.getItems();
	}
}
