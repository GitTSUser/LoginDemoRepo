package com.capg.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entities.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

}
