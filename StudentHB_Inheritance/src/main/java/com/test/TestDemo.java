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
		
		College c1 = new College();
		
		c1.setC_name("Rv");
		
		Student stu = new Student();
		
		stu.setC_name("Sarvamangala");
		stu.setS_type("Regular");
		stu.setS_branch("ECE");
		
		Faculty f1 = new Faculty();
		
		f1.setC_name("Arjun");
		f1.setF_type("regular");
		f1.setF_skill("Admin");
		
		
		session.persist(c1);
		session.persist(stu);
		session.persist(f1);
		
		t.commit();
		session.close();
		

	}

}
