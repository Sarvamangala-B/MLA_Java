package com.test;

import java.util.List;

public class TestDemo {
 
		public static void main(String[] arg) {
			
			EmpDao edao = new EmpDao();
			Employee emp1 = new Employee();
			
			emp1.setId(2);
			emp1.setName("balakrishna");
			emp1.setCmp("Hp");
			emp1.setCity("Bangalore");
			edao.saveEmployee(emp1);
			System.out.println("Saved Employee Data......");
			
			
			//edao.updateEmployee(emp1);
			//edao.deleteEmployee(2);
			List<Employee> data = edao.getAllEmployee();
			data.forEach(System.out::println);
			
		}
}
