package com.hexaware.springrestjpapractice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestjpapractice.entities.HealthCareProvider;

@Repository
public interface HealthCareRepository extends JpaRepository<HealthCareProvider, Long>{

	List<HealthCareProvider> findByHealthcareProviderName(String healthcareProviderName);
	
	@Modifying
	@Query("delete from HealthCareProvider h where h.healthcareProviderName=?1")
	int deleteHealthCareByName(String name);
	
	@Query("select h from HealthCareProvider h where h.healthcareProviderName like ?1%")
	List<HealthCareProvider> findByHealthcareProviderNameFirst(char a);
	
}
