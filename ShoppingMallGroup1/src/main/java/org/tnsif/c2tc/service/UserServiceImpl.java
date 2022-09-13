package org.tnsif.c2tc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.User;
import org.tnsif.c2tc.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserRepository repo;

	@Override
	public int addUser(User user) {
		User u= repo.save(user);
		if(u!=null)
			return 1;
		else
			return 0;
	}

	@Override
	public User UpdateUser(User user) {
		User u=repo.save(user);
		return u;
	}

	@Override
	public boolean DeleteUser(int id) {
		User u=GetUser(id);
		if(u!=null)
		{
			repo.delete(u);
			return true;
		}
		else
		return false;
	}

	@Override
	public List<User> GetUsers() {
		List<User> Users=repo.findAll();
		return Users;
	}

	@Override
	public User GetUser(int id) {
		User u=(User) repo.findById(id).get();
		return u;
	}
}
