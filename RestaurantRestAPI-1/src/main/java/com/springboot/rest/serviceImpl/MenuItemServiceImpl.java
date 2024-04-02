package com.springboot.rest.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.rest.exception.ResourceNotFoundException;
import com.springboot.rest.model.MenuItem;
import com.springboot.rest.repository.MenuItemRepository;
import com.springboot.rest.service.MenuItemService;

@Service
public class MenuItemServiceImpl implements MenuItemService {
	
	private MenuItemRepository menuItemRepository;

	public MenuItemServiceImpl(MenuItemRepository menuItemRepository) {
		super();
		this.menuItemRepository = menuItemRepository;
	}

	
	@Override
	public MenuItem saveItem(MenuItem item) {
		
		return menuItemRepository.save(item);
	}

	
	@Override
	public List<MenuItem> getAllItems() {
		
		return menuItemRepository.findAll();
	}

	
	@Override
	public MenuItem getItemById(long id) {
		MenuItem item=  menuItemRepository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("Item", "Id", id)
				);
		return item;
	}


	@Override
	public MenuItem updateItem(MenuItem item, long id) {
		
		MenuItem existingItem=  menuItemRepository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("Item", "Id", id)
				);
		
		existingItem.setName(item.getName());
		
		existingItem.setCategeory(item.getCategeory());
		
		existingItem.setDescription(item.getDescription());
		
		existingItem.setPrice(item.getPrice());
		
		existingItem.setRating(item.getRating());
		
		menuItemRepository.save(existingItem);
		
		return existingItem;
	}


	@Override
	public void deleteItem(long id) {
		
		menuItemRepository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("Item", "Id", id)
				);
		
		menuItemRepository.deleteById(id);
		
	}
	

}
