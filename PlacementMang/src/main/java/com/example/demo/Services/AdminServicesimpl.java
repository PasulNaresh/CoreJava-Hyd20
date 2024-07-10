package com.example.demo.Services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Admin.Admin;
import com.example.demo.Repositary.AdminRepositary;

@Service
public class AdminServicesimpl implements AdminServices {
	
	@Autowired
	AdminRepositary ar;
	
	public Admin saveAdmin(Admin admin ) {
	return ar.save(admin);
	
	}

	@Override
	public List<Admin> fetchAdminList() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	@Override
	public Admin fetchAdminById(Long id) {
		// TODO Auto-generated method stub
		return ar.findById(id).get();
	}

	@Override
	public void deleteAdminById(Long id) {
		// TODO Auto-generated method stub
	    ar.deleteById(id);
	}

	@Override
	public Admin updateAdmin(Long id, Admin admin) {
		// TODO Auto-generated method stub
		 Admin adminDB = ar.findById(id).get();
		 
			       if(Objects.nonNull(admin.getName()) &&
			               !"".equalsIgnoreCase(admin.getName())) {
			           adminDB.setName(admin.getName());
			       }

			       if(Objects.nonNull(admin.getPassword()) &&
			               !"".equalsIgnoreCase(admin.getPassword())) {
			           adminDB.setPassword(admin.getPassword());
			       }

			       return ar.save(adminDB);
	}
}
