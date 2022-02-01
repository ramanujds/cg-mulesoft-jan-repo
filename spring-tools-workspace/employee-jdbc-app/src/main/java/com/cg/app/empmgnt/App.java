package com.cg.app.empmgnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	
        // Create Connection
    	String url = "jdbc:mysql://localhost:3306/cg_mulesoft_jan";
    	String username = "root";
    	String password = "password";
    	try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successful");
		
		// Create Statement
			
//			Statement smt = con.createStatement();
//			
//			String query = "select * from employee";
//			
//			ResultSet resultSet =  smt.executeQuery(query);
//			
//			while(resultSet.next()) {
//				String employeeId = resultSet.getString("emp_id");
//				String employeeName = resultSet.getString("emp_name");
//				float salary =resultSet.getFloat("salary");
//				LocalDate joinDate = LocalDate.parse(resultSet.getString("join_date"));
//				int dept = resultSet.getInt("deptno");
//				String reportingTo = resultSet.getString("reporting_to");
//				System.out.println(employeeId+"\t"+employeeName+"\t"+salary+"\t"+joinDate+"\t"+dept+"\t"+reportingTo);
//			}
			
			// Inserting a new Record
			
//			PreparedStatement psmt = con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
//			String employeeId = "e501";
//			String employeeName = "Gaurav Sharma";
//			float salary =65000.0F;
//			LocalDate joinDate = LocalDate.parse("2020-02-05");
//			int dept = 20;
//			String reportingTo = "e101";
//			
//			psmt.setString(1, employeeId);
//			psmt.setString(2, employeeName);
//			psmt.setFloat(3, salary);
//			psmt.setString(4, joinDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//			psmt.setInt(5, dept);
//			psmt.setString(6, reportingTo);
//			
//			int rowsUpdated = psmt.executeUpdate();
//			if(rowsUpdated>0) {
//				System.out.println("Data Inserted Successfully");
//			}
			
			// Deleting a Record
			
			PreparedStatement psmt = con.prepareStatement("delete from employee where emp_id=?");
			
			System.out.println("Enter an ID to delete : ");
			
			String empId = scan.nextLine();
			
			psmt.setString(1,empId);
			
			int rowsUpdated = psmt.executeUpdate();
			if(rowsUpdated>0) {
				System.out.println("Data Deleted Successfully");
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	
    	
    }
}
