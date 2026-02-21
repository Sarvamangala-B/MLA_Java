package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Address a1 = new Address();
		
		a1.setCity("Bangalore");
		a1.setState("Karnataka");
		
		Employee e1 = new Employee();
		e1.setE_name("Sarvamangala");
		e1.setE_cmp("mphasis");
		e1.setAddress(a1);
		a1.setEmployee(e1);
		
		
		
		session.persist(e1);
		
		t.commit();
		
		session.close();
				
		
	}

}
