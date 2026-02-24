package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
//		
////		Customer ad = ctx.getBean("cst", Customer.class);
//		Customer ad1 = ctx.getBean("cst1", Customer.class);                 //this is for xml with constructor
//		
////		System.out.println(ad);
//		System.out.println(ad1);
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
		Address aobj = ctx.getBean(Address.class);
		aobj.setCity("abc");
		aobj.setState("AP");
		aobj.setCountry("In");
		
		Customer cobj = ctx.getBean(Customer.class);
		
		cobj.setId(1122);
		cobj.setName("SKY");
		cobj.setAdr(aobj);
		
		System.out.println(cobj);
		
		
	}

}
