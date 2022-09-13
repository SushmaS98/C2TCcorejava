package org.tnsif.c2tc.service;

import java.util.List;

import org.tnsif.c2tc.entities.Orderdetail;

public interface OrderdetailService {

	int addOrderdetail(Orderdetail orderdetail);

	Orderdetail UpdateOrderdetail(Orderdetail orderdetail);

	boolean DeleteOrderdetail(int id);

	List<Orderdetail> GetOrderdetails();

	Orderdetail GetOrderdetail(int id);

}
