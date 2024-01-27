package com.hexaware.springjdbcpractice.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbcpractice.models.HealthCareProvider;


@Repository
public class HealthCareProviderDaoImp implements IHealthCareProviderDao {

	JdbcTemplate jdbcTemplate;

	@Autowired
	public HealthCareProviderDaoImp(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);

	}

	@Override
	public boolean createHealthCareProvider(HealthCareProvider healthCareProvider) {
		String insertHealtCareProvider = "insert into healthcareprovider(healthcareid,healthcareprovidername,providerGender,address,email) values(?,?,?,?,?)";
		int count = jdbcTemplate.update(insertHealtCareProvider, healthCareProvider.getHealthCareId(),
				healthCareProvider.getHealthcareProviderName(), healthCareProvider.getProviderGender(),
				healthCareProvider.getAddress(), healthCareProvider.getEmail());

		return count > 0;
	}

	@Override
	public List<HealthCareProvider> selectHealthCareProviderByName(String healthCareProviderName) {
		String selectHealtCareProviderByName = "select healthcareid,healthcareprovidername,providerGender,address,email from HealthCareProvider where healthcareprovidername=?";

		List<HealthCareProvider> list = jdbcTemplate.query(selectHealtCareProviderByName,
				new HealthCareProviderMapper(), healthCareProviderName);
		return list;
	}

	@Override
	public List<HealthCareProvider> selectAllHealthCareProvider() {
		String selectHealtCareProviderByName = "select healthcareid,healthcareprovidername,providerGender,address,email from HealthCareProvider";

		List<HealthCareProvider> list = jdbcTemplate.query(selectHealtCareProviderByName,
				new HealthCareProviderMapper());
		return list;
	}

}
