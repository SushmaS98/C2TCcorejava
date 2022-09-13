package org.tnsif.c2tc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.c2tc.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
