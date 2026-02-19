package com.test;
import java.sql.*;
import java.util.Scanner;
public class crud {
	

	

	    // Database credentials (Change as per your setup)
	    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
	    private static final String USER = "root";
	    private static final String PASSWORD = "root@39";

	    // Create table if not exists
	    private static void createTable() {
	        String sql = "CREATE TABLE IF NOT EXISTS employees (" +
	                     "id INT PRIMARY KEY AUTO_INCREMENT, " +
	                     "name VARCHAR(100) NOT NULL, " +
	                     "salary DOUBLE NOT NULL)";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             Statement stmt = conn.createStatement()) {
	            stmt.execute(sql);
	            System.out.println("Table 'employees' is ready.");
	        } catch (SQLException e) {
	            System.err.println("Error creating table: " + e.getMessage());
	        }
	    }

	    // CREATE
	    private static void insertEmployee(String name, double salary) {
	        String sql = "INSERT INTO employees (name, salary) VALUES (?, ?)";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, name);
	            pstmt.setDouble(2, salary);
	            int rows = pstmt.executeUpdate();
	            System.out.println(rows + " employee(s) inserted.");
	        } catch (SQLException e) {
	            System.err.println("Insert error: " + e.getMessage());
	        }
	    }

	    // READ
	    private static void readEmployees() {
	        String sql = "SELECT * FROM employees";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
	            System.out.println("ID | Name | Salary");
	            while (rs.next()) {
	                System.out.printf("%d | %s | %.2f%n",
	                        rs.getInt("id"),
	                        rs.getString("name"),
	                        rs.getDouble("salary"));
	            }
	        } catch (SQLException e) {
	            System.err.println("Read error: " + e.getMessage());
	        }
	    }

	    // UPDATE
	    private static void updateEmployee(int id, double newSalary) {
	        String sql = "UPDATE employees SET salary = ? WHERE id = ?";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setDouble(1, newSalary);
	            pstmt.setInt(2, id);
	            int rows = pstmt.executeUpdate();
	            System.out.println(rows + " employee(s) updated.");
	        } catch (SQLException e) {
	            System.err.println("Update error: " + e.getMessage());
	        }
	    }

	    // DELETE
	    private static void deleteEmployee(int id) {
	        String sql = "DELETE FROM employees WHERE id = ?";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            int rows = pstmt.executeUpdate();
	            System.out.println(rows + " employee(s) deleted.");
	        } catch (SQLException e) {
	            System.err.println("Delete error: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        createTable(); // Ensure table exists

	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("\n--- JDBC CRUD Menu ---");
	            System.out.println("1. Insert Employee");
	            System.out.println("2. View Employees");
	            System.out.println("3. Update Employee Salary");
	            System.out.println("4. Delete Employee");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");

	            int choice;
	            try {
	                choice = Integer.parseInt(sc.nextLine());
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Enter a number.");
	                continue;
	            }

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter salary: ");
	                    try {
	                        double salary = Double.parseDouble(sc.nextLine());
	                        insertEmployee(name, salary);
	                    } catch (NumberFormatException e) {
	                        System.out.println("Invalid salary.");
	                    }
	                    break;
	                case 2:
	                    readEmployees();
	                    break;
	                case 3:
	                    System.out.print("Enter employee ID: ");
	                    try {
	                        int id = Integer.parseInt(sc.nextLine());
	                        System.out.print("Enter new salary: ");
	                        double newSalary = Double.parseDouble(sc.nextLine());
	                        updateEmployee(id, newSalary);
	                    } catch (NumberFormatException e) {
	                        System.out.println("Invalid input.");
	                    }
	                    break;
	                case 4:
	                    System.out.print("Enter employee ID: ");
	                    try {
	                        int id = Integer.parseInt(sc.nextLine());
	                        deleteEmployee(id);
	                    } catch (NumberFormatException e) {
	                        System.out.println("Invalid ID.");
	                    }
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }
	}


