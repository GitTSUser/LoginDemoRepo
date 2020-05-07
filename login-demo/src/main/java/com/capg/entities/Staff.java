package com.capg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "login_staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "staff_id", length = 6)
	private Long id;
	@Column(name = "staff_username", length = 10)
	private String username;
	@Column(name = "staff_phone", length = 10)
	private String phone;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "admin_id")
	private Admin admin;


	public Staff() {
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin adminId) {
		this.admin = adminId;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
