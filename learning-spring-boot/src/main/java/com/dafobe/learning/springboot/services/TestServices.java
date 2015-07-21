package com.dafobe.learning.springboot.services;

import java.util.List;

import com.dafobe.learning.springboot.model.entities.Item;

public interface TestServices {

	List<Item> getItems();

	Item getItem(Integer id);

}
