package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StoreData {
	public static void main(String[] args) {
	 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();		
		Transaction t = session.beginTransaction();
		
		Book obj = new Book();
		
		obj.setB_name("java");
		obj.setB_author("Mfddgjgf");
		obj.setB_price(5454);
		session.remove(obj);
		
		//session.persist(obj);
		t.commit();
		
		
		Query<Book> q= session.createQuery("from Book");
		
		List<Book> list = q.list();
		
		for(Book b:list) {
			System.out.println(b.getId()+" "+b.getB_name()+' '+b.getB_author()+ " "+b.getB_price());
			
		}
		
		
		
//		Book dt = session.get(Book.class, 52);
//		System.out.println(dt.getId()+" "+dt.getB_name()+' '+dt.getB_author()+ " "+dt.getB_price());
//		
//		dt.setB_name("abc");
//		dt.setB_author("cba");
//		dt.setB_price(53);
//		
//		session.persist(dt);
//		
		session.remove(obj);
//		
		
		//t.commit();
		
		
		System.out.println("Done");
		
		
		
		System.out.println("Done");
		
	}
}
