package org.tnsif.c2tc.service;

import java.util.List;

import org.tnsif.c2tc.entities.Item;

public interface ItemService {

	int addItem(Item item);

	Item UpdateItem(Item item);

	boolean DeleteItem(int id);

	Item GetItem(int id);

	List<Item> GetItems();

}
