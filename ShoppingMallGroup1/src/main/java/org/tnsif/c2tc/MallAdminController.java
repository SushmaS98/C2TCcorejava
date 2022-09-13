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
import org.tnsif.c2tc.entities.MallAdmin;
import org.tnsif.c2tc.service.MallAdminService;

@RestController
public class MallAdminController 
{
	@Autowired
	MallAdminService service;
	
		@PostMapping("/addMallAdmin")
		public String AddMallAdmin(@RequestBody MallAdmin mallAdmin)
		{
			int count=  service.addMallAdmin(mallAdmin);
			return (count +"no of values got added");
		}
		@PutMapping("/updateMallAdmin")
		public MallAdmin UpdateMallAdmin(@RequestBody MallAdmin mallAdmin)
		{
			return service.UpdateMallAdmin(mallAdmin);
		}
		@DeleteMapping("/deleteMallAdmin/{id}")
		public String DeleteMallAdmin(@PathVariable int id)
		{
			boolean success=service.DeleteMallAdmin(id);
			if(success)
				return "Deletion Successful";
			else
				return "Deletion Failed";					
		}
		@GetMapping("/getMallAdmins")
		public List<MallAdmin> GetMallAdmins()
		{
			return service.GetMallAdmins();
		}	
		@GetMapping("/getMallAdmin/{id}")
		public MallAdmin GetMallAdmin(@PathVariable int id)
		{
			return service.GetMallAdmin(id);
		}

}
