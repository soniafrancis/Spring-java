package com.transaction.Springtransactiondemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Pateint {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pateintNumber;
	private String Name;
	private String Gender;
	private String Mobile;
	private int Age;
	
	public Long getPateintNumber() {
		return pateintNumber;
	}

	public void setPateintNumber(Long pateintNumber) {
		this.pateintNumber = pateintNumber;
	}

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

	public Pateint(Long pateintNumber, String name, String gender, String mobile, int age) {
		super();
		this.pateintNumber = pateintNumber;
		Name = name;
		Gender = gender;
		Mobile = mobile;
		Age = age;
	}

	public Pateint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
