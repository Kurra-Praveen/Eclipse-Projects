package com.springboot.rest.service;

import java.util.List;

import com.springboot.rest.model.MenuItem;

public interface MenuItemService {
	
	MenuItem saveItem(MenuItem item);
	
	List<MenuItem>getAllItems();
	
	MenuItem getItemById(long id);
	
	MenuItem updateItem(MenuItem item,long id);
	
	void deleteItem(long id);

}
