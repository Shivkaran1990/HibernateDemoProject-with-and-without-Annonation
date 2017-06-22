package com.karan.hbr.HibernetDemo;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="STUDENT")
public class Student {
	@Id@GeneratedValue
	@Column(name="Roll_NUMBER")
	int rollNumber;
	@Column(name="NAME")
	String Name;
	@Column(name="SURNAME")
	String Surname;
	@Column(name="MOBILE_NUMBER")
	String mobileNumber;
	@Column(name="Birth_OF_DATE")
    Date DOB;
	
	
	
	
	
	public int getRollNumber() {
		return rollNumber;
	}
	public String getName() {
		return Name;
	}
	public String getSurname() {
		return Surname;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}


}
