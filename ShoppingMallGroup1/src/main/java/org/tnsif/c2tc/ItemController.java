package org.tnsif.c2tc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.c2tc.entities.Item;
import org.tnsif.c2tc.service.ItemService;

@RestController
public class ItemController 
{
	@Autowired
	ItemService service;
	
	@PostMapping("/addItem")
	public String AddItem(@RequestBody Item item)
	{
		int count=  service.addItem(item);
		return (count +"no of values got added");
	}
	@PutMapping("/updateItem")
	public Item UpdateItem(@RequestBody Item item)
	{
		return service.UpdateItem(item);
	}
	@DeleteMapping("/deleteItem/{id}")
	public String DeleteItem(@PathVariable int id)
	{
		boolean success=service.DeleteItem(id);
		if(success)
			return "Deletion Successful";
		else
			return "Deletion Failed";					
	}
	@GetMapping("/getItems")
	public List<Item> GetItems()
	{
		return service.GetItems();
	}	
	@GetMapping("/getItem/{id}")
	public Item GetItem(@PathVariable int id)
	{
		return service.GetItem(id);
	}

}
