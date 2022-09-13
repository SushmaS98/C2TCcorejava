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
import org.tnsif.c2tc.entities.Orderdetail;
import org.tnsif.c2tc.service.OrderdetailService;

@RestController
public class OrderdetailController
{
	@Autowired
	OrderdetailService service;
	
	@PostMapping("/addOrderdetail")
	public String AddOrderdetail(@RequestBody Orderdetail orderdetail)
	{
		int count=  service.addOrderdetail(orderdetail);
		return (count +"no of values got added");
	}
	@PutMapping("/updateOrderdetail")
	public Orderdetail UpdateOrderdetail(@RequestBody Orderdetail orderdetail)
	{
		return service.UpdateOrderdetail(orderdetail);
	}
	@DeleteMapping("/deleteOrderdetail/{id}")
	public String DeleteOrderdetail(@PathVariable int id)
	{
		boolean success=service.DeleteOrderdetail(id);
		if(success)
			return "Deletion Successful";
		else
			return "Deletion Failed";					
	}
	@GetMapping("/getOrderdetails")
	public List<Orderdetail> GetOrderdetails()
	{
		return service.GetOrderdetails();
	}	
	@GetMapping("/getOrderdetail/{id}")
	public Orderdetail GetOrderdetail(@PathVariable int id)
	{
		return service.GetOrderdetail(id);
	}

}
