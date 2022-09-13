package org.tnsif.c2tc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.Orderdetail;
import org.tnsif.c2tc.repo.OrderdetailRepository;

@Service
public class OrderdetailServiceImpl implements OrderdetailService
{
	@Autowired
	OrderdetailRepository repo;

	@Override
	public int addOrderdetail(Orderdetail orderdetail) {
		Orderdetail od= repo.save(orderdetail);
		if(od!=null)
			return 1;
		else
			return 0;
	}

	@Override
	public Orderdetail UpdateOrderdetail(Orderdetail orderdetail) {
		Orderdetail od=repo.save(orderdetail);
		return od;
	}

	@Override
	public boolean DeleteOrderdetail(int id) {
		Orderdetail od=GetOrderdetail(id);
		if(od!=null)
		{
			repo.delete(od);
			return true;
		}
		else
		return false;
	}

	@Override
	public List<Orderdetail> GetOrderdetails() {
		List<Orderdetail> Orderdetails=repo.findAll();
		return Orderdetails;
	}

	@Override
	public Orderdetail GetOrderdetail(int id) {
		Orderdetail od=(Orderdetail) repo.findById(id).get();
		return od;
	}
	

}
