package org.tnsif.c2tc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.c2tc.entities.Orderdetail;

public interface OrderdetailRepository extends JpaRepository<Orderdetail, Integer>
{

}
