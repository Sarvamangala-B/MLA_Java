package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	
	
	public static Connection getCon() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mlafeb";
		String user = "root";
		String pas = "root@39";
		Connection con = null;
		 
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pas);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	
	public void saveStudent(Student emp) {
		
		try {
		String sql="insert  into student (usn,stu_name,department,city) values(?,?,?,?)";
		
		Connection con = EmpDao.getCon();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, emp.getUsn());
		pst.setString(2, emp.getName());
		pst.setString(3,emp.getDepartment());
		pst.setString(4,  emp.getCity());
		
		pst.execute();
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public List<Student> getAllStudent(){
		List<Student> empList = new ArrayList<>();
		try {
			
			String sql= "select * from student";
			PreparedStatement pst = EmpDao.getCon().prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Student emp = new Student();
				emp.setUsn(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDepartment(rs.getString(3));
				emp.setCity(rs.getString(4));
				empList.add(emp);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return empList;
		
	}
	
	public void updateStudent(Student emp) {
		
		try {
			String sql = "update student set stu_name = ?, department=?, city=?  where usn = ?";
			PreparedStatement pst = EmpDao.getCon().prepareStatement(sql);
			pst.setInt(4, emp.getUsn());
			pst.setString(1, emp.getName());
			pst.setString(2,emp.getDepartment());
			pst.setString(3,  emp.getCity());
			
			pst.execute();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(String name) {
		try {
			String sql = "Delete from student where stu_name = ?";
			PreparedStatement pst = EmpDao.getCon().prepareStatement(sql);
			pst.setString(1,name);
			pst.execute();
			
		}catch(Exception e) {
			
		}
	}
	
}
