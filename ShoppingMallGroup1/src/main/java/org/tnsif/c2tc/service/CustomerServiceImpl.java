package org.tnsif.c2tc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.Customer;
import org.tnsif.c2tc.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	CustomerRepository repo;
	
	@Override
	public int addCustomer(Customer customer) {
		Customer c= repo.save(customer);
		if(c!=null)
			return 1;
		else
			return 0;
	}

	@Override
	public Customer UpdateCustomer(Customer customer) {
		Customer c=repo.save(customer);
		return c;
	}

	
	@Override
	public boolean DeleteCustomer(int id) {
		Customer c=GetCustomer(id);
		if(c!=null)
		{
			repo.delete(c);
			return true;
		}
		else
		return false;
	}

	@Override
	public List<Customer> GetCustomers() {
		List<Customer> Customers=repo.findAll();
		return Customers;
	}

	@Override
	public Customer GetCustomer(int id) {
		Customer c=(Customer) repo.findById(id).get();
		return c;
	}
}
