package com.hexaware.hibernate_mappings_practice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Invoice {
	@Id
	private int invoiceId;
	private String description;
	
	@OneToOne
	private Patient patient;
	
	

	public Invoice() {
		super();
	}

	public Invoice(int invoiceId, String description, Patient patient) {
		super();
		this.invoiceId = invoiceId;
		this.description = description;
		this.patient = patient;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	

}
