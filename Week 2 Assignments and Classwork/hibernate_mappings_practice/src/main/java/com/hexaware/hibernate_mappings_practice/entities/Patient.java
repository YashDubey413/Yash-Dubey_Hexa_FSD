package com.hexaware.hibernate_mappings_practice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	private int patientId;
	private String patientName;
	
}
