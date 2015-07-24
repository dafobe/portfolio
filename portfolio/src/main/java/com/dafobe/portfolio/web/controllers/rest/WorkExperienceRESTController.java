package com.dafobe.portfolio.web.controllers.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dafobe.portfolio.model.entities.Item;
import com.dafobe.portfolio.services.TestServices;


@RestController
@RequestMapping("/portfolio/test")
public class WorkExperienceRESTController {
	private static final Logger LOGGER = LoggerFactory.getLogger(WorkExperienceRESTController.class);
	
	@Autowired
	private TestServices testServices;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Item> findAll() {
		LOGGER.debug("displaying default request mapping HELLO WORLD");
		return testServices.getItems();
	}
}