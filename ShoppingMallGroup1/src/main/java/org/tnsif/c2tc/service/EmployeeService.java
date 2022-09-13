package org.tnsif.c2tc.service;

import java.util.List;
import org.tnsif.c2tc.entities.Employee;

public interface EmployeeService {

	public int addEmployee(Employee employee);

	public Employee UpdateEmployee(Employee employee);

	public boolean DeleteEmployee(int id);

	public List<Employee> GetEmployees();

	public Employee GetEmployee(int id);

}
