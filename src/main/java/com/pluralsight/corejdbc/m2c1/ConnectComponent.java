package com.pluralsight.corejdbc.m2c1;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectComponent {
	
	public boolean tryConnection() throws Exception{

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=password&serverTimezone=UTC")){
				
			boolean isValid = connection.isValid(2);
			connection.close();

			return isValid;
		}
    }

}
