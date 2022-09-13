package org.tnsif.c2tc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.c2tc.entities.CustomerShop;

public interface CustomerShopRepository extends JpaRepository<CustomerShop, Integer>
{

}
