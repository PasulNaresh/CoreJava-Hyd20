package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Admin.Admin;
import com.example.demo.Services.AdminServices;

@RestController
public class AdminController {

	@Autowired
	AdminServices as;
	
	@PostMapping("/admins")
	public Admin saveAdmin(@RequestBody Admin admin) {
		
		return as.saveAdmin(admin);
	
	}
	@GetMapping("/admins")
	    public List<Admin> fetchAdminList() {
	       
	        return as.fetchAdminList();
	    }
	    
	   @GetMapping("/admins/{id}")
	    public Admin fetchAdminById(@PathVariable("id") Long id) {
	        return as.fetchAdminById(id);
	    }
	    
	    @DeleteMapping("/admins/{id}")
	    public String deleteAdminById(@PathVariable("id") Long id) {
	        as.deleteAdminById(id);
	        return "row deleted Successfully!!";
	    }
	    
	    @PutMapping("/admins/{id}")
	    public Admin updateAdmin(@PathVariable("id") Long id,
	                                       @RequestBody Admin admin) {
	        return as.updateAdmin(id,admin);
	    }

	
}
