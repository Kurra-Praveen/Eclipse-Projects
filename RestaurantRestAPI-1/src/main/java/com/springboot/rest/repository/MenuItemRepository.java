package com.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

}
