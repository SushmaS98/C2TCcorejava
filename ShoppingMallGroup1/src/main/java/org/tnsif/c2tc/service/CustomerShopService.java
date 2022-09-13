package org.tnsif.c2tc.service;

import java.util.List;

import org.tnsif.c2tc.entities.CustomerShop;

public interface CustomerShopService {

	int addCustomerShop(CustomerShop customershop);

	CustomerShop UpdateCustomerShop(CustomerShop customershop);

	boolean DeleteCustomerShop(int id);

	List<CustomerShop> GetCustomerShops();

	CustomerShop GetCustomerShop(int id);

}
