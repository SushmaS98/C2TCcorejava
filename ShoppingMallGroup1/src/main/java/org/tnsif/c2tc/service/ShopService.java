package org.tnsif.c2tc.service;

import java.util.List;

import org.tnsif.c2tc.entities.Shop;

public interface ShopService {

	int addShop(Shop shop);

	Shop UpdateShop(Shop shop);

	boolean DeleteShop(int id);

	List<Shop> GetShops();

	Shop GetShop(int id);

}
