package com.capg.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entities.Admin;

@Repository
public interface LoginRepository extends JpaRepository<Admin, Long> {

	public Admin findAdminByUsernameAndPassword(String username, String password);
	
}
