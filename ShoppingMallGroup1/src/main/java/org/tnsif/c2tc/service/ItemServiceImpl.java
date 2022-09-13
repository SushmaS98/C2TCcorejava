package org.tnsif.c2tc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.Item;
import org.tnsif.c2tc.repo.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService
{
	@Autowired
	ItemRepository repo;
	
	@Override
	public int addItem(Item item) {
		Item i= repo.save(item);
		if(i!=null)
			return 1;
		else
			return 0;
	}

	@Override
	public Item UpdateItem(Item item) {
		Item i=repo.save(item);
		return i;
	}

	@Override
	public boolean DeleteItem(int id) {
		Item i=GetItem(id);
		if(i!=null)
		{
			repo.delete(i);
			return true;
		}
		else
		return false;
	}

	@Override
	public Item GetItem(int id) {
		Item i=(Item) repo.findById(id).get();
		return i;
	}

	@Override
	public List<Item> GetItems() {
		List<Item> Items=repo.findAll();
		return Items;
	}
}
