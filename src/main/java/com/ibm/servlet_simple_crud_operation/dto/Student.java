package com.ibm.servlet_simple_crud_operation.dto;

import java.time.LocalDate;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String nickName;

	private String email;
	private String password;

	private LocalDate dob;

	private long mobile;

	private String gender;
	private String address;
	
	
	public Student() {
		super();
	}


	public Student(String firstName, String lastName, String nickName, String email, String password, LocalDate dob,
			long mobile, String gender, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.mobile = mobile;
		this.gender = gender;
		this.address = address;
	}


	public Student(int id, String firstName, String lastName, String nickName, String email, String password,
			LocalDate dob, long mobile, String gender, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.mobile = mobile;
		this.gender = gender;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	
}
