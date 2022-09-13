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
import org.tnsif.c2tc.entities.Employee;
import org.tnsif.c2tc.service.EmployeeService;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeService service;
	
	@PostMapping("/addEmployee")
	public String AddEmployee(@RequestBody Employee employee)
	{
		int count=  service.addEmployee(employee);
		return (count +"no of values got added");
	}
	@PutMapping("/updateEmployee")
	public Employee UpdateEmployee(@RequestBody Employee employee)
	{
		return service.UpdateEmployee(employee);
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public String DeleteEmployee(@PathVariable int id)
	{
		boolean success=service.DeleteEmployee(id);
		if(success)
			return "Deletion Successful";
		else
			return "Deletion Failed";					
	}
	@GetMapping("/getEmployees")
	public List<Employee> GetEmployees()
	{
		return service.GetEmployees();
	}	
	@GetMapping("/getEmployee/{id}")
	public Employee GetEmployee(@PathVariable int id)
	{
		return service.GetEmployee(id);
	}
}
