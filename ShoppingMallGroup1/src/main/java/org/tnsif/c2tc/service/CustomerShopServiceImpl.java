package org.tnsif.c2tc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.CustomerShop;
import org.tnsif.c2tc.repo.CustomerShopRepository;

@Service
public class CustomerShopServiceImpl implements CustomerShopService
{
	@Autowired
	CustomerShopRepository repo;

	@Override
	public int addCustomerShop(CustomerShop customershop) {
		CustomerShop cs= repo.save(customershop);
		if(cs!=null)
			return 1;
		else
			return 0;
	}

	@Override
	public CustomerShop UpdateCustomerShop(CustomerShop customershop) {
		CustomerShop cs=repo.save(customershop);
		return cs;
	}

	@Override
	public boolean DeleteCustomerShop(int id) {
		CustomerShop cs=GetCustomerShop(id);
		if(cs!=null)
		{
			repo.delete(cs);
			return true;
		}
		else
		return false;
	}

	@Override
	public List<CustomerShop> GetCustomerShops() {
		List<CustomerShop> CustomerShops=repo.findAll();
		return CustomerShops;
	}

	@Override
	public CustomerShop GetCustomerShop(int id) {
		CustomerShop cs=(CustomerShop) repo.findById(id).get();
		return cs;
	}

}
