

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.c2tc.entities.Customer;
import org.tnsif.c2tc.service.CustomerService;

@RestController
public class CustomerController 
{
	@Autowired
	CustomerService service;
	
		@PostMapping("/addCustomer")
		public String AddCustomer(@RequestBody Customer customer)
		{
			int count=  service.addCustomer(customer);
			return (count +"no of values got added");
		}
		@PutMapping("/updateCustomer")
		public Customer UpdateCustomer(@RequestBody Customer customer)
		{
			return service.UpdateCustomer(customer);
		}
		@DeleteMapping("/deleteCustomer/{id}")
		public String DeleteCustomer(@PathVariable int id)
		{
			boolean success=service.DeleteCustomer(id);
			if(success)
				return "Deletion Successful";
			else
				return "Deletion Failed";					
		}
		@GetMapping("/getCustomers")
		public List<Customer> GetCustomers()
		{
			return service.GetCustomers();
		}	
		@GetMapping("/getCustomer/{id}")
		public Customer GetCustomer(@PathVariable int id)
		{
			return service.GetCustomer(id);
		}
}
