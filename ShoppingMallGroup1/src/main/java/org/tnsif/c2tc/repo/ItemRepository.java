package org.tnsif.c2tc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.c2tc.entities.Item;

public interface ItemRepository extends JpaRepository<Item,Integer >
{

}
