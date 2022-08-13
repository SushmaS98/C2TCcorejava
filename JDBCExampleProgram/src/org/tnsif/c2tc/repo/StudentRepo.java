package org.tnsif.c2tc.repo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.tnsif.c2tc.entities.Student;

public interface StudentRepo {
	Statement createstatement() ;
	PreparedStatement createPrepareStatement(String query)  ;
	public ResultSet ReterieveQuery(String query) ;
	public int DeleteQuery(String query) ;
	public int UpdateQuery(String query, Student student);
	public int AddQuery(String query, Student student) ;

}