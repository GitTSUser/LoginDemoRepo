package com.capg.service;

import java.util.List;

import com.capg.entities.Staff;

public interface IStaffService {

	public List<Staff> getAllStaff();

	public Staff addStaff(Staff staff);
}
