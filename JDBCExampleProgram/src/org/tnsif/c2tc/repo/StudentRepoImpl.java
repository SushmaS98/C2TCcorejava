package org.tnsif.c2tc.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.tnsif.c2tc.dao.StudentDAO;
import org.tnsif.c2tc.entities.Student;

public class StudentRepoImpl implements StudentRepo {
	StudentDAO dao;
	public StudentRepoImpl()
	{
		dao=new StudentDAO();
	}
	//Connection creating
	public Statement createstatement() {
		
		Connection connection=dao.createConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			statement=null;
		}
		return statement;
	}
	public PreparedStatement createPrepareStatement(String query)  {
		Connection connection=dao.createConnection();
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(query);
		} catch (SQLException e) {
			statement=null;
		}
		return statement;
	}
	
	//Retrieve elements from the table 
	public ResultSet ReterieveQuery(String query) {
		Statement statement=createstatement();
		ResultSet rs;
		try {
			rs = statement.executeQuery(query);
		} catch (SQLException e) {
			rs=null;
		}
		return rs;
		
	}
	
	//Deleting an element from the table
	public int DeleteQuery(String query) {
		Statement statement=createstatement();
		int count;
		try {
			count = statement.executeUpdate(query);
		} catch (SQLException e) {
			count=0;
		}
		return count;
	}
	
	//Updating element in the table
	public int UpdateQuery(String query, Student student)  {
		PreparedStatement statement=createPrepareStatement(query);
		int count=0;
		try
		{
			statement.setInt(2, student.getUid());
			statement.setString(1, student.getName());
			count =statement.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return count;
		
	}
	
	//Adding element to the table
	public int AddQuery(String query, Student student) {
		PreparedStatement statement=createPrepareStatement(query);
		int count=0;
		try
		{
			statement.setInt(1, student.getUid());
			statement.setString(2, student.getName());
			count =statement.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return count;
	}
	

}
