package com.hexaware.springannotations.beans;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	
	private int patientId;
	private String patientName;
	private char Gender;
	
	public Patient() {
		
	}

	
	public Patient(int patientId, String patientName, char gender) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		Gender = gender;
	}



	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public char getGender() {
		return Gender;
	}

	public void setGender(char gender) {
		Gender = gender;
	}
	
	
	

}
