package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Student std1 = ctx.getBean("std", Student.class);
		System.out.println(std1);
		
		ExpressionParser exp = new SpelExpressionParser();
		Expression ex = exp.parseExpression("'Simple MLA coders Spring EL example'");
		
		String dt = ex.getValue(String.class);
		
		System.out.println(dt+" literals ");
		
		Expression ex1 = exp.parseExpression("'Simple MLA coders Spring EL example'".toUpperCase());
		
		String dt1 = ex1.getValue(String.class);
		
		System.out.println(dt1+" literals ");
		
		Expression ex2 = exp.parseExpression("100*5");
		
		Integer dt2 = ex2.getValue(Integer.class);
		
		System.out.println(dt2);

	}

}
