package com.example.demo.Services;

import java.util.List;

import com.example.demo.Admin.Admin;

public interface AdminServices {

	Admin saveAdmin(Admin admin);

	List<Admin> fetchAdminList();

	Admin fetchAdminById(Long id);

	void deleteAdminById(Long id);

	Admin updateAdmin(Long id, Admin admin);

}
