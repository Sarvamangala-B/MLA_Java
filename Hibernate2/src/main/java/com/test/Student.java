package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Student {
	
	
	private String s_name;
	private String s_dpt;
	
	
	private int s_id;

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_dpt() {
		return s_dpt;
	}

	public void setS_dpt(String s_dpt) {
		this.s_dpt = s_dpt;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public Student(String s_name, String s_dpt, int s_id) {
		this.s_name = s_name;
		this.s_dpt = s_dpt;
		this.s_id = s_id;
	}

	public Student() {

	}
	
	

	
}
