package com.dafobe.portfolio.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dafobe.portfolio.model.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}