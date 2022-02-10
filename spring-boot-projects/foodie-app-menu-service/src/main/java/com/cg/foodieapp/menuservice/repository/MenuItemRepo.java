package com.cg.foodieapp.menuservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.foodieapp.menuservice.model.MenuItem;

public interface MenuItemRepo extends JpaRepository<MenuItem, String> {

}
