package org.tnsif.c2tc.service;

import java.util.List;

import org.tnsif.c2tc.entities.User;

public interface UserService {

	int addUser(User user);

	User UpdateUser(User user);

	boolean DeleteUser(int id);

	List<User> GetUsers();

	User GetUser(int id);

}
