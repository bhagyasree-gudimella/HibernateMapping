package com.lavanya.gudimella.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lavanya.gudimella.configuration.HibernateConfiguration;
import com.lavanya.gudimella.dto.Student;

public class StudentDao {
	
	private Session session;
	private Transaction transaction;
	
	/*
	 * save person to database using Hibernate save() method
	 */
	public void saveStudent(Student student) {
		session = HibernateConfiguration.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
	}
}
