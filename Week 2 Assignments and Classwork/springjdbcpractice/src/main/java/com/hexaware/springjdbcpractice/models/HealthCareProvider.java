package com.hexaware.springjdbcpractice.models;



import org.springframework.stereotype.Component;

@Component
public class HealthCareProvider {
	
	int healthCareId;
    String healthcareProviderName;
    String providerGender;
    String address;
    String email;
    
    public HealthCareProvider() {
    	
    }
    
	public HealthCareProvider(int healthCareId, String healthcareProviderName, String providerGender, String address,
			String email) {
		super();
		this.healthCareId = healthCareId;
		this.healthcareProviderName = healthcareProviderName;
		this.providerGender = providerGender;
		this.address = address;
		this.email = email;
	}
	public int getHealthCareId() {
		return healthCareId;
	}
	public void setHealthCareId(int healthCareId) {
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
