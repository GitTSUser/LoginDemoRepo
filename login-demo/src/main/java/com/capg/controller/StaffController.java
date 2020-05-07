package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entities.Staff;
import com.capg.service.IStaffService;

@RestController
@RequestMapping("/demoapp")
public class StaffController {

	@Autowired
	private IStaffService staffService;

	@PostMapping("/staff")
	public Staff addStaff(@RequestBody Staff staff) {
		return staffService.addStaff(staff);
	}
	
	@GetMapping("/staff")
	public List<Staff> getAllStaff() {

		return staffService.getAllStaff();
	}


}
