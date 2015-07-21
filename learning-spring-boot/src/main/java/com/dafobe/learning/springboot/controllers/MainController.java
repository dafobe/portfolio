package com.dafobe.learning.springboot.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	private static final String DEFAULT_VIEW = "home";
	private static final String CONTACT_VIEW = "contact";
	
	@RequestMapping(value = { "/", "/home"}, method = { RequestMethod.GET, RequestMethod.POST })
	public String renderDefault() {
		LOGGER.debug("render default view : Home");
		return DEFAULT_VIEW;
	}
	
	@RequestMapping(value = { "/contact"}, method = { RequestMethod.GET, RequestMethod.POST })
	public String renderContact() {
		LOGGER.debug("render view : Contact");
		return CONTACT_VIEW;
	}
}
