package com.dafobe.portfolio.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafobe.portfolio.model.entities.Item;
import com.dafobe.portfolio.model.repositories.ItemRepository;
import com.dafobe.portfolio.services.TestServices;

@Service
public class TestServicesImpl implements TestServices {
	private static Logger LOGGER = LoggerFactory.getLogger(TestServices.class);

	@Autowired
	ItemRepository itemRepository;

	@Override
	public List<Item> getItems(){
		LOGGER.info("getItems({})");

		List<Item> resp = new ArrayList<Item>();

		LOGGER.debug("getItems()");

		resp = itemRepository.findAll();
		
		LOGGER.info("getItems() ends. resp");
		return resp;
	}
}
