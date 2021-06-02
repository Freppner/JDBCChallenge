package de.telekom.jdbcchallenge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Testkomentar");

		final String DRIVER = "com.mysql.cj.jdbc.Driver";			//Einbinden des Datenbanktreibers
		// final String DRIVER = "org.mariadb.jdbc.Driver";	
		try {
				Class.forName(DRIVER);
		}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		
			
		final String URL ="jdbc:mysql://localhost:3306/seadb?user=seauser&password=seapass"; 
		//final String URL ="jdbc:mariadb://localhost:3306/seadb?user=seauser&password=seapass"; 
		Connection connection;
		
		try { 
			connection = DriverManager.getConnection(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		
			//Connection connection = DriverManager.getConnection(URL);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery( "select * from personen"); 
		
			while(resultSet.next()) {
			    System.out.print("ID: "+ resultSet.getInt(1)); 	// ID
			    System.out.print("     ");
			    System.out.print("Anrede: "+ resultSet.getString(2)); // ANREDE
			    System.out.print("     ");
			    System.out.print("Vorname: "+resultSet.getString(3)); // VORNAME
			    System.out.print("     ");
			    System.out.print("Nachname: "+resultSet.getString(4)); // NACHNAME
			    }
			
			resultSet.close();
			statement.close();
			connection.close();
		
	}

}





























