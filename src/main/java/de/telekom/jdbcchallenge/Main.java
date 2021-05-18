package de.telekom.jdbcchallenge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testkomentar");

		final String DRIVER = "com.mysql.cj.jdbc.Driver";			//Einbinden des Datenbanktreibers
		try {
				Class.forName(DRIVER);
		}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		
			
		final String URL ="jdbc:mysql://localhost:3306/seadb?user=seauser&password=seapass"; 
		try { 
			Connection connection = DriverManager.getConnection(URL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
