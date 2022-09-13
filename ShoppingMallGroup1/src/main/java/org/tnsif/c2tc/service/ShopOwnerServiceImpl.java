package org.tnsif.c2tc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.ShopOwner;
import org.tnsif.c2tc.repo.ShopOwnerRepository;

@Service
public class ShopOwnerServiceImpl implements ShopOwnerService
{
	@Autowired
	ShopOwnerRepository repo;
	
	@Override
	public int addShopOwner(ShopOwner shopOwner) {
		ShopOwner so= repo.save(shopOwner);
		if(so!=null)
			return 1;
		else
			return 0;
	}

	@Override
	public ShopOwner UpdateShopOwner(ShopOwner shopOwner) {
		ShopOwner so=repo.save(shopOwner);
		return so;
	}

	@Override
	public boolean DeleteShopOwner(int id) {
		ShopOwner so=GetShopOwner(id);
		if(so!=null)
		{
			repo.delete(so);
			return true;
		}
		else
		return false;

	}

	@Override
	public List<ShopOwner> GetShopOwners() {
		List<ShopOwner> ShopOwners=repo.findAll();
		return ShopOwners;
	}

	@Override
	public ShopOwner GetShopOwner(int id) {
		ShopOwner so=(ShopOwner) repo.findById(id).get();
		return so;
	}
	

}
