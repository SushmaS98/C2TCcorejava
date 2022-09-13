package org.tnsif.c2tc.service;

import java.util.List;

import org.tnsif.c2tc.entities.ShopOwner;

public interface ShopOwnerService {

	int addShopOwner(ShopOwner shopOwner);

	ShopOwner UpdateShopOwner(ShopOwner shopOwner);

	boolean DeleteShopOwner(int id);

	List<ShopOwner> GetShopOwners();

	ShopOwner GetShopOwner(int id);

}
