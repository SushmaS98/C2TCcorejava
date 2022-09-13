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
import org.tnsif.c2tc.entities.Shop;
import org.tnsif.c2tc.service.ShopService;

@RestController
public class ShopController 
{
	@Autowired
	ShopService service;
	
		@PostMapping("/addShop")
		public String AddShop(@RequestBody Shop shop)
		{
			int count=  service.addShop(shop);
			return (count +"no of values got added");
		}
		@PutMapping("/updateShop")
		public Shop UpdateShop(@RequestBody Shop shop)
		{
			return service.UpdateShop(shop);
		}
		@DeleteMapping("/deleteShop/{id}")
		public String DeleteShop(@PathVariable int id)
		{
			boolean success=service.DeleteShop(id);
			if(success)
				return "Deletion Successful";
			else
				return "Deletion Failed";					
		}
		@GetMapping("/getShops")
		public List<Shop> GetShops()
		{
			return service.GetShops();
		}	
		@GetMapping("/getShop/{id}")
		public Shop GetShop(@PathVariable int id)
		{
			return service.GetShop(id);
		}
	

}
