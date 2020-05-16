package com.hostel.mgt.bean;

public class UserBean {
	
	private long id;
	private String name;
	private String email;
	private String phoneNumber;
	private String gender;
	private String password;
	
	
	
	public UserBean(String name, String email, String phoneNumber, String gender, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.password = password;
	}
	public UserBean(long id, String name, String email, String phoneNumber, String gender, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.password = password;
	}
	public UserBean() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
