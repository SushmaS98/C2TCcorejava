package org.tnsif.c2tc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDAO {
	public Connection createConnection() 
	{
		//Connection to MySQL
		String url="jdbc:mysql://localhost:3306/b18";
		String user="root1";
		String pwd="1999";
		//Driver manager
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) 
		{
			System.err.println(" ");
			//e.printStackTrace();
		}
		Connection connection;
		try {
			connection = DriverManager.getConnection(url,user,pwd);
		} catch (SQLException e) {
			connection=null;
		}
		return connection;
	}

}
