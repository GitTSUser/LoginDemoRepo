package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entities.Admin;
import com.capg.repos.LoginRepository;

@Service
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Admin getAdmin(String username, String password) {
		return loginRepository.findAdminByUsernameAndPassword(username, password);
	}

	@Override
	public Admin addAdmin(Admin admin) {
		return loginRepository.save(admin);
	}

}
