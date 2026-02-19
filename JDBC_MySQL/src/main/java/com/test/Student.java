package com.test;

public class Student {

	
	private int usn;
	private String name;
	private String department;
	private String city;
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String departmeny) {
		this.department = departmeny;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", departmeny=" + department + ", city=" + city + "]";
	}
	
	
	
}
