package com.hexaware.mappings.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;

@Entity
public class Address {
	
	@Id
	private int addressId;
	
	private String city;
	
	@OneToOne(mappedBy="address",cascade=CascadeType.ALL) //opposite side reference variable
	
	private Student student;

	public Address() {
		super();
	}

	

	public Address(int addressId, String city) {
		super();
		this.addressId = addressId;
		this.city = city;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public Address(int addressId, String city, Student student) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.student = student;
	}



	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

//	@Override
//	public String toString() {
//		return "Address [addressId=" + addressId + ", city=" + city + "]";
//	}
	
	


}
