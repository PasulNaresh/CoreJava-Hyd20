package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Admin.Admin;

@Repository
public interface AdminRepositary extends JpaRepository<Admin, Long> {

}
