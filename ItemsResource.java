package com.rest.webservices.restfulwebservices.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ItemsResource {
	
	@Autowired
	public ItemsService itemService;
	
	@GetMapping("/showcase")
	public List<Items> getAllTodos(){
		return itemService.findAll();
	}	
	
}
