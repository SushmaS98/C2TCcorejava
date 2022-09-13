package org.tnsif.c2tc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.c2tc.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer >
{

	
}

