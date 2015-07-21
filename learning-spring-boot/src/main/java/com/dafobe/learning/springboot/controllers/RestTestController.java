package com.dafobe.learning.springboot.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dafobe.learning.springboot.model.entities.Item;
import com.dafobe.learning.springboot.services.TestServices;


@RestController
@RequestMapping("/test")
public class RestTestController {
	private static final Logger LOGGER = LoggerFactory.getLogger(RestTestController.class);
	
	@Autowired
	private TestServices testServices;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Item> findAll() {
		LOGGER.debug("REST request : getItems");
		return testServices.getItems();
	}
	
	@RequestMapping(value="/{itemId}",method = RequestMethod.GET)
	public Item findItem(@PathVariable Integer itemId) {
		LOGGER.debug("REST request: getItem {}", itemId);
		return testServices.getItem(itemId);
	}
}
