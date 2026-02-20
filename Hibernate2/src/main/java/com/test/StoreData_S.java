package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StoreData_S {
	public static void main(String[] args) {
		 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();		
		Transaction t = session.beginTransaction();
		
		Student obj = new Student();
		
		obj.setS_name("sql");
		obj.setS_dpt("absd");
		
		session.persist(obj);
		t.commit();
		
		
//		Query<Student> q= session.createQuery("from Student");
//		
//		List<Student> list = q.list();
//		
//		for(Student b:list) {
//			System.out.println(b.getId()+" "+b.getName()+' '+b.getDpt());
//			
//		}
		
		
		
//		Student dt = session.get(Student.class, 1);
//		System.out.println(b.getId()+" "+b.getName()+' '+b.getDpt());
////		
//		dt.setName("java");
//		dt.setDpt("Mfddgjgf");
//		dt.setId(3);
//		
//		
//		session.persist(dt);
//		
		//session.remove(obj);
//		
		
		//t.commit();
		
		
		System.out.println("Done");
		
		
		
		System.out.println("Done");
		
	}
}
