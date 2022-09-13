package org.tnsif.c2tc.service;

import java.util.List;
import org.tnsif.c2tc.entities.Customer;

public interface CustomerService
{
	public boolean DeleteCustomer(int id);
	public List<Customer> GetCustomers();
	public Customer GetCustomer(int id);
	public int addCustomer(Customer customer);
	public Customer UpdateCustomer(Customer customer);
}
