package org.tnsif.c2tc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.Employee;
import org.tnsif.c2tc.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeRepository repo;

	@Override
	public int addEmployee(Employee employee) {
		Employee e= repo.save(employee);
		if(e!=null)
			return 1;
		else
			return 0;
	}
	
	@Override
	public Employee UpdateEmployee(Employee employee) {
		Employee e=repo.save(employee);
		return e;
	}
	
	@Override
	public boolean DeleteEmployee(int id) {
		Employee e=GetEmployee(id);
		if(e!=null)
		{
			repo.delete(e);
			return true;
		}
		else
		return false;
	}

	@Override
	public List<Employee> GetEmployees() {
		List<Employee> Employees=repo.findAll();
		return Employees;
	}

	@Override
	public Employee GetEmployee(int id) {
		Employee e=(Employee) repo.findById(id).get();
		return e;
	}



	
	

}
