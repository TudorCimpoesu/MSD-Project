package com.internship.java;

import java.sql.*;
import javax.swing.JFrame;

public class Internship {
	JFrame frame;
	
	public Internship() {
		initComp();
	}
	
	public void initComp() {
		frame = new JFrame("Example");
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Student student = new Student();
		Date date = new Date();
		Team team = new Team();
		Project project = new Project();
		Benefit benefit = new Benefit();
		Schedule schedule = new Schedule();
				
		//new Internship();
		
		try{  
		Class.forName("oracle.jdbc.OracleDriver");  
		  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:databaseSDBI","sys as sysdba","12345");  
		  
		Statement stmt=con.createStatement();  
		    
		// stmt.executeUpdate("INSERT INTO EMP" + " VALUES ('"+variabila1+"','"+nume+"','"+varsta+"')"); 
		ResultSet rs=stmt.executeQuery("select * from STUDENT");  
		while(rs.next())  
		System.out.println(rs.getString(2));  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}

	}

