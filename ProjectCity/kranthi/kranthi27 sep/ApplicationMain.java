package com.mysql.jdbc.kranthi;

import java.sql.*;
import java.util.Scanner;

public class ApplicationMain {

	public static void main(String[] args) {
		updateQuery();
		
		 Scanner sc = new Scanner(System.in);
			System.out.println  ("\nDisplay course details:\n");
			
			 displaystudentDetails();
			 
			
			 
			 System.out.println  ("add a new course");
			 
			  String  COURSE = sc.nextLine();
			 
			  System.out.println ("\n");
			  
			  System.out.println  ("Please enter  name");
				 
				 String  name = sc.nextLine();
				 System.out.println ("\n");
			  
			 
		 System.out.println  ("Please enter Course name");
		 
		 String  Coursename = sc.nextLine();
		 System.out.println ("\n");
		 
		 System.out.println("Please enter Course id");
		 int  courseid = sc.nextInt();
		 System.out.println ("\n");
		 
		 
		 System.out.println("Please enter age");
		 int  age= sc.nextInt();
		 System.out.println ("\n");
		 
		 
		 
		 System.out.println("Please enter  email");
		 String  email= sc.nextLine();
		 System.out.println ("\n");
		 
		 
		 System.out.println("Please ENTER COURSESHORTFORM");
		 String  Courseshortform = sc.nextLine();
		 System.out.println ("\n");
		 
		 System.out.println("please enter address");
		 String  address = sc.nextLine();
		 System.out.println ("\n");
		 
		 System.out.println(" enter User want choose id");
		 
		 int choose = sc.nextInt();
		 
	}
		 
	public static void displaystudentDetails() {
  		try {
  			Class.forName("com.mysql.cj.jdbc.Driver");  
  			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/y4j","root","K@#kranthi42!");           
  			Statement statement = connect.createStatement();
  			ResultSet result = statement.executeQuery("Select * from courseDetails");
  			while(result.next()) {
  				System.out.println(result.getString(1)+" "+result.getString(2) + " " + result.getInt(3)+""+result.getInt(4)+""+result.getString(5)+""+result.getString(6)+""+result.getString(7));
  			}
  		}catch(Exception e){
  			System.out.print(e.toString());
  		}
}
	 
		 
	public static void updateQuery() {
  		try {
  			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/y4j","root","K@#kranthi42!");
  			Statement statement = connect.createStatement();
  			statement.executeUpdate("insert into courseDetails\n"
  					+  "values ('kiran','oracle', 11,36,'kir@gmail.com', 'ora','nizampet')" );
  		}catch(Exception e) {
  			System.out.println(e.toString());
  		}
		
	}
	
}

	
	
	
	
