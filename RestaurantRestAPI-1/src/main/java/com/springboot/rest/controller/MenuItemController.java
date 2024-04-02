package com.springboot.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.model.MenuItem;
import com.springboot.rest.service.MenuItemService;

@RestController
@RequestMapping("/api")
public class MenuItemController {

	private MenuItemService menuItemService;

	public MenuItemController(MenuItemService menuItemService) {
		super();
		this.menuItemService = menuItemService;
	}
	
	//add menu item api 
	
	@PostMapping("/addItem")
	public ResponseEntity<MenuItem> saveItem( @RequestBody MenuItem item) {
		
		return new ResponseEntity<MenuItem>(menuItemService.saveItem(item), HttpStatus.OK);
		
	}
	
	//Get items 
	@GetMapping("/all-Items")
	public List<MenuItem> getAllItems(){
		
		return menuItemService.getAllItems();
	}
	
	//Get items by Id
	
	@GetMapping(path ="/item/{id}")
	public ResponseEntity<MenuItem>getItemById(@PathVariable("id") long id){
		
		return new ResponseEntity<MenuItem>(menuItemService.getItemById(id), HttpStatus.OK);
		
	}
	
	@PutMapping(path="/update-item/{id}")
	public ResponseEntity<MenuItem> updateItem(@RequestBody MenuItem item,@PathVariable("id")long id) {
		
		return new ResponseEntity<MenuItem>(menuItemService.updateItem(item, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete-item/{id}")
	public ResponseEntity<String> deleteItem(@PathVariable("id")long id){
		
		menuItemService.deleteItem(id);
		
		return new ResponseEntity<String>("Deleted sucessfully",HttpStatus.ACCEPTED);
		
	}
}
