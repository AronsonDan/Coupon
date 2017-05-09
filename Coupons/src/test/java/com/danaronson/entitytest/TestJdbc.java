package com.danaronson.entitytest;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/finalproject?useSSL=false";
		String user = "hbstudent";
		String password = "hbstudent";
		
		try {
			System.out.println("Connecting To DB: " + jdbcUrl);
			
			Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
			
			System.out.println("connection Successful");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
