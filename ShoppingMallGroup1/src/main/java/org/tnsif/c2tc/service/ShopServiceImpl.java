package org.tnsif.c2tc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.Shop;
import org.tnsif.c2tc.repo.ShopRepository;

@Service
public class ShopServiceImpl implements ShopService
{
	@Autowired
	ShopRepository repo;

	@Override
	public int addShop(Shop shop) {
		Shop s= repo.save(shop);
		if(s!=null)
			return 1;
		else
			return 0;
	}

	@Override
	public Shop UpdateShop(Shop shop) {
		Shop s=repo.save(shop);
		return s;
	}

	@Override
	public boolean DeleteShop(int id) {
		Shop s=GetShop(id);
		if(s!=null)
		{
			repo.delete(s);
			return true;
		}
		else
		return false;
	}

	@Override
	public List<Shop> GetShops() {
		List<Shop> Shops=repo.findAll();
		return Shops;
	}

	@Override
	public Shop GetShop(int id) {
		Shop s=(Shop) repo.findById(id).get();
		return s;
	}
	

}
