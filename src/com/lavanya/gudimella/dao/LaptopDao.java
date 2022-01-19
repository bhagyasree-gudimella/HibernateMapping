package com.lavanya.gudimella.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.lavanya.gudimella.configuration.HibernateConfiguration;
import com.lavanya.gudimella.dto.Laptop;

public class LaptopDao {
	
	private Session session;
	private Transaction transaction;

	/*
	 * save laptop to database using Hibernate save() method
	 */
	public void saveLaptop(Laptop laptop) {
		session = HibernateConfiguration.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(laptop);
		transaction.commit();
		session.close();
	}
}
