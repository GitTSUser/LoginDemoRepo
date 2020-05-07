package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entities.Staff;
import com.capg.repos.StaffRepository;

@Service
public class StaffServiceImpl implements IStaffService {

	@Autowired
	private StaffRepository staffRepository;

	@Override
	public List<Staff> getAllStaff() {
		return staffRepository.findAll();
	}

	@Override
	public Staff addStaff(Staff staff) {
		return staffRepository.save(staff);
	}

	
}
