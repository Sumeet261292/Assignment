package com.rest.webservices.restfulwebservices.items;

import java.util.ArrayList;
import java.util.List;

public class ItemsService {
	private static List<Items> items = new ArrayList<>();

	static {
		items.add(new Items("Cheese",2.50,"Refrigerated foods",2));
		items.add(new Items("Crisps",3, "the Snack isle",5));
		items.add(new Items("pizza", 4, "Refrigerated foods",7));
		items.add(new Items("Chocolate",1.50, "the Snack isle",8));
		items.add(new Items("Self-raising flour",1.50, "Home baking", 0));
		items.add(new Items("Ground almonds",3,"Home baking",1));
	}

	public List<Items> findAll(){
		return items;
	}
	
	public Items findById(String name) {
		for(Items item:items) {
			if(item.getName()==name) {
				return item;
			}
		}
		return null;
	}
}


