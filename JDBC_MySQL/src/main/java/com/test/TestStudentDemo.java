package com.test;

import java.util.List;

public class TestStudentDemo {
	public static void main(String[] arg) {
		
		StudentDao edao = new StudentDao();
		Student stu1 = new Student();
		
		stu1.setUsn(1);
		stu1.setName("sarvamangala");
		stu1.setDepartment("ECE");
		stu1.setCity("Bangalore");
		edao.saveStudent(stu1);
		System.out.println("Saved Student Data......");
		
		
	
		
Student stu2 = new Student();
		
		stu2.setUsn(2);
		stu2.setName("Jayamangala");
		stu2.setDepartment("ECE");
		stu2.setCity("Bangalore");
		edao.saveStudent(stu2);
		System.out.println("Saved Student Data......");
		
		
Student stu3 = new Student();
		
	stu3.setUsn(3);
	stu3.setName("Deepa");
		stu3.setDepartment("ECE");
		stu3.setCity("Bangalore");
		//edao.saveStudent(stu3);
		//System.out.println("Saved Student Data......");
		
		
		//edao.updateStudent(stu3);
		edao.deleteStudent("Deepa");
		List<Student> data = edao.getAllStudent();
		data.forEach(System.out::println);
		
	}
}
