package com.transaction.Springtransactiondemo.controller.dto;



public class AppointmentFormDto {
	
	private String Name;
	private String Gender;
	private String Mobile;
	private int Age;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}

	
}
