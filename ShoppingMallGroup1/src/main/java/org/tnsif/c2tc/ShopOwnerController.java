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
import org.tnsif.c2tc.entities.ShopOwner;
import org.tnsif.c2tc.service.ShopOwnerService;

@RestController
public class ShopOwnerController 
{
	@Autowired
	ShopOwnerService service;
	
		@PostMapping("/addShopOwner")
		public String AddShopOwner(@RequestBody ShopOwner shopOwner)
		{
			int count=  service.addShopOwner(shopOwner);
			return (count +"no of values got added");
		}
		@PutMapping("/updateShopOwner")
		public ShopOwner UpdateShopOwner(@RequestBody ShopOwner shopOwner)
		{
			return service.UpdateShopOwner(shopOwner);
		}
		@DeleteMapping("/deleteShopOwner/{id}")
		public String DeleteShopOwner(@PathVariable int id)
		{
			boolean success=service.DeleteShopOwner(id);
			if(success)
				return "Deletion Successful";
			else
				return "Deletion Failed";					
		}
		@GetMapping("/getShopOwners")
		public List<ShopOwner> GetShopOwners()
		{
			return service.GetShopOwners();
		}	
		@GetMapping("/getShopOwner/{id}")
		public ShopOwner GetShopOwner(@PathVariable int id)
		{
			return service.GetShopOwner(id);
		}
}
