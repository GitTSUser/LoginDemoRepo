package com.capg.service;

import com.capg.entities.Admin;

public interface ILoginService {

	public Admin getAdmin(String username,String password);

	public Admin addAdmin(Admin admin);
}
