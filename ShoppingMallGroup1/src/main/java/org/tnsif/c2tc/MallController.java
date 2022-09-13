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
import org.tnsif.c2tc.entities.Mall;
import org.tnsif.c2tc.service.MallService;

@RestController
public class MallController
{
	@Autowired
	MallService service;
	
		@PostMapping("/addMall")
		public String AddMall(@RequestBody Mall mall)
		{
			int count=  service.addMall(mall);
			return (count +"no of values got added");
		}
		@PutMapping("/updateMall")
		public Mall UpdateMall(@RequestBody Mall mall)
		{
			return service.UpdateMall(mall);
		}
		@DeleteMapping("/deleteMall/{id}")
		public String DeleteMall(@PathVariable int id)
		{
			boolean success=service.DeleteMall(id);
			if(success)
				return "Deletion Successful";
			else
				return "Deletion Failed";					
		}
		@GetMapping("/getMalls")
		public List<Mall> GetMalls()
		{
			return service.GetMalls();
		}	
		@GetMapping("/getMall/{id}")
		public Mall GetMall(@PathVariable int id)
		{
			return service.GetMall(id);
		}

}
