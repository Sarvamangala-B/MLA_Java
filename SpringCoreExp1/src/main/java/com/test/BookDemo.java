package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDemo {

	public static void main(String[] args) {
		/*
		 * ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		 * Book b = (Book)ctx.getBean("bk"); //we need to typecast to book class
		 * 
		 * System.out.println(b);
		 */
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class); //here we are trying to pass annogconfig instead of xml
		
		BookDetails b1 = ctx.getBean(BookDetails.class);
		Book b2 = ctx.getBean(Book.class);     
		b1.setPyear(2026);
		
		List<BookDetails> list  = new ArrayList<>();
		list.add(b1);
		
		b2.setId(101);
		b2.setName("Spring notes");
		b2.setAuthor("Sarvamangala");
		b2.setPrice(5);
		
		b2.setListbd(list);
		
		System.out.println(b2);
	}
}
      