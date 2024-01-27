package com.hexaware.hibernate_practice.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.hibernate_practice.models.HealthCareProvider;

public class HealthCareProviderDaoImp implements IHealthCareProviderDao {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();
	
	
	
	
	

	@Override
	public void createHealthCareProvider(HealthCareProvider healthCareProvider) {
		
		Transaction txn = session.beginTransaction();
		Serializable ser=session.save(healthCareProvider);
		//System.out.println(ser.toString());
		
		txn.commit();
		session.clear();
		
		
	}

	@Override
	public void updateHealthCareProvider(HealthCareProvider healthCareProvider) {
		Transaction txn = session.beginTransaction();
		session.saveOrUpdate(healthCareProvider);
		txn.commit();
		session.clear();
		
		
	}

	@Override
	public void deleteHealthCareProvider(HealthCareProvider healthCareProvider) {
		Transaction txn = session.beginTransaction();
		session.delete(healthCareProvider);
		txn.commit();
		session.clear();
		
	}

	@Override
	public List<HealthCareProvider> selectHealthCareProviderByName(String healthCareProviderName) {
		//String selectByName="select e from HealthCareProvider e where e.healthCareProviderName=?1";
		Query<HealthCareProvider> query=session.createNamedQuery("selectHealthCareProviderByName");
		query.setParameter("name",healthCareProviderName);
		List<HealthCareProvider> list=query.getResultList();
		
		session.clear();
		return list;
		
		
	}

	@Override
	public List<HealthCareProvider> selectAllHealthCareProvider() {
		
		Query<HealthCareProvider> query=session.createNamedQuery("selectAllHealthCareProvider");
		List<HealthCareProvider> list=query.getResultList();
		
		session.clear();
		return list;
		
	}

}
