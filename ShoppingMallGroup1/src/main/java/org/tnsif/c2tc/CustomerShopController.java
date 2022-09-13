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
import org.tnsif.c2tc.entities.CustomerShop;
import org.tnsif.c2tc.service.CustomerShopService;

@RestController
public class CustomerShopController
{
	@Autowired
	CustomerShopService service;
	
		@PostMapping("/addCustomerShop")
		public String AddCustomerShop(@RequestBody CustomerShop customershop)
		{
			int count=  service.addCustomerShop(customershop);
			return (count +"no of values got added");
		}
		@PutMapping("/updateCustomerShop")
		public CustomerShop UpdateCustomerShop(@RequestBody CustomerShop customershop)
		{
			return service.UpdateCustomerShop(customershop);
		}
		@DeleteMapping("/deleteCustomerShop/{id}")
		public String DeleteCustomerShop(@PathVariable int id)
		{
			boolean success=service.DeleteCustomerShop(id);
			if(success)
				return "Deletion Successful";
			else
				return "Deletion Failed";					
		}
		@GetMapping("/getCustomerShops")
		public List<CustomerShop> GetCustomerShops()
		{
			return service.GetCustomerShops();
		}	
		@GetMapping("/getCustomerShop/{id}")
		public CustomerShop GetCustomerShop(@PathVariable int id)
		{
			return service.GetCustomerShop(id);
		}

}
