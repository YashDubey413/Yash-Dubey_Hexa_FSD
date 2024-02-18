package com.hexaware.springrestjpapractice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class HealthCareProvider {
	@Id
	@Min(100)
	long healthCareId;
	@NotBlank
    String healthcareProviderName;
	@NotBlank
    String providerGender;
	@NotBlank
    String address;
    @Email
    String email;
    
    public HealthCareProvider() {
    	
    }
    
	public HealthCareProvider(long healthCareId, String healthcareProviderName, String providerGender, String address,
			String email) {
		super();
		this.healthCareId = healthCareId;
		this.healthcareProviderName = healthcareProviderName;
		this.providerGender = providerGender;
		this.address = address;
		this.email = email;
	}
	public long getHealthCareId() {
		return healthCareId;
	}
	public void setHealthCareId(long healthCareId) {
		this.healthCareId = healthCareId;
	}
	public String getHealthcareProviderName() {
		return healthcareProviderName;
	}
	public void setHealthcareProviderName(String healthcareProviderName) {
		this.healthcareProviderName = healthcareProviderName;
	}
	public String getProviderGender() {
		return providerGender;
	}
	public void setProviderGender(String providerGender) {
		this.providerGender = providerGender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "HealthCareProvider [healthCareId=" + healthCareId + ", healthcareProviderName=" + healthcareProviderName
				+ ", providerGender=" + providerGender + ", address=" + address + ", email=" + email + "]";
	}
	

}