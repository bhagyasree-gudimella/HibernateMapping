package com.lavanya.gudimella.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
	
	private static Configuration configuration;
	private static SessionFactory sessionFactory;
	
	
	static {
		configuration = new Configuration();
		sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	/*
	 * returns session Factory object 
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
