package org.tnsif.c2tc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.c2tc.entities.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Integer > 
{

}
