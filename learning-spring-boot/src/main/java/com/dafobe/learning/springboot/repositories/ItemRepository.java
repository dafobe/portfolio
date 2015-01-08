package com.dafobe.learning.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dafobe.learning.springboot.model.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}