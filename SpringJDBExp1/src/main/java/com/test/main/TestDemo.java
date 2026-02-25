package com.test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.MLATeamDAO1;
import com.test.dao.MLATeamDao;
import com.test.model.MLATeam;

public class TestDemo {
	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		MLATeamDao dao= ctx.getBean("tdao", MLATeamDao.class);
//		MLATeam obj = new MLATeam();
//		
//		obj.setId(101);
//		obj.setName("jammm");
//		obj.setSkill("python+");
//		obj.setManager("jddm");
//		
////		dao.saveMLATeam(obj); //for saving
//
//		dao.updateMLATeam(obj);
//		
//		List<MLATeam> list = dao.getAllMembers();       //for printing
//		
//		list.forEach(team -> System.out.println(team.getId()+" "+team.getName()+" "+team.getSkill()+" "+team.getManager()));
//		
////		dao.deleteMLATeam(obj);       //for deleting
//		
//		dao.updateMLATeam(obj);
		
		
		
		
		// FOR NAMED THESE STEPS 
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		MLATeamDao dao= ctx.getBean("tdao", MLATeamDao.class);
		MLATeamDAO1 dao1= ctx.getBean("tdao1", MLATeamDAO1.class);
		MLATeam obj = new MLATeam();
		
		obj.setId(301);
		obj.setName("LOL");
		obj.setSkill("JAVA");
		obj.setManager("ABC");
		
		dao1.createMLATeam(obj);
		
		List<MLATeam> list = dao.getAllMembers();       //for printing
		
		list.forEach(team -> System.out.println(team.getId()+" "+team.getName()+" "+team.getSkill()+" "+team.getManager()));
		

		
		
		
	}

}
