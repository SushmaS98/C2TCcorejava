package org.tnsif.c2tc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.c2tc.entities.User;
import org.tnsif.c2tc.service.UserService;

@RestController
public class UserController
{
	@Autowired
	UserService service;
	
		@PostMapping("/addUser")
		public String AddUser(@RequestBody User user)
		{
			int count=  service.addUser(user);
			return (count +"no of values got added");
		}
		@PutMapping("/updateUser")
		public User UpdateUser(@RequestBody User user)
		{
			return service.UpdateUser(user);
		}
		@DeleteMapping("/deleteUser/{id}")
		public String DeleteUser(@PathVariable int id)
		{
			boolean success=service.DeleteUser(id);
			if(success)
				return "Deletion Successful";
			else
				return "Deletion Failed";					
		}
		@GetMapping("/getUsers")
		public List<User> GetUsers()
		{
			return service.GetUsers();
		}	
		@GetMapping("/getUser/{id}")
		public User GetUser(@PathVariable int id)
		{
			return service.GetUser(id);
		}

}
