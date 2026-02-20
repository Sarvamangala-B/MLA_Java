package com.test;

import java.util.List;

public class CustDemo {
	public static void main(String[] args) {
	
		CustDao cdao = new CustDao();
		Customer cst = new Customer();
		cst.setC_id(3);         //only for updation
		cst.setC_name("jayamangala");
		cst.setC_city("Bangalore");
	//	cdao.saveCustomer(cst);          //for adding customers
//		cdao.updateCustomer(cst);       // for updating customers
		List<Customer>  list = cdao.getAllCustomers();   //to get or print only
		list.forEach(System.out::println);
		//cdao.deleteCustomer(cst);    //for deletion
		
	}
}
