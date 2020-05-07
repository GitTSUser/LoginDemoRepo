package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entities.Admin;
import com.capg.service.ILoginService;

@RestController
@RequestMapping("/demoapp")
public class LoginController {

	@Autowired
	private ILoginService loginService;

	@PostMapping("/admins")
	public Admin addAdmin(@RequestBody Admin admin) {
		return loginService.addAdmin(admin);
	}
	
	@GetMapping("/admins")
	public Admin getAdmin(@RequestParam String username, @RequestParam String password) {

		return loginService.getAdmin(username, password);
	}


}
