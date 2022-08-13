package org.tnsif.c2tc.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.tnsif.c2tc.entities.Student;
import org.tnsif.c2tc.repo.StudentRepo;
import org.tnsif.c2tc.repo.StudentRepoImpl;

public class StudentServicesImpl implements StudentService {

	public Student GetStudent(int uid) {
		Student student=new Student();
		StudentRepo repo=new StudentRepoImpl();
		String query="SELECT * FROM details WHERE uid=" + uid;
		ResultSet rs=repo.ReterieveQuery(query);
		try {
			rs.next();
			student.setUid(rs.getInt(1));
			student.setName(rs.getString(2));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
		
	}
	
	//Listing all the elements
	public List<Student> GetStudents()
	{
		List<Student> students =new ArrayList<Student>();
		StudentRepo repo=new StudentRepoImpl();
		String query="SELECT * FROM details";
		ResultSet rs=repo.ReterieveQuery(query);
		try
		{
			while(rs.next())
			{
				Student student=new Student();
				student.setUid(rs.getInt(1));
				student.setName(rs.getString(2));
				students.add(student);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return students;
	}
	
	//Deleting element from  the table
	public boolean DeleteStudent(int uid) {
		StudentRepo repo =new StudentRepoImpl();
		String query="DELETE FROM details WHERE uid = " + uid;
		int count =repo.DeleteQuery(query);
		if(count==1)
			return true;
		else
			return false;
	}
	
	// Adding element to the table
	public boolean AddStudent(Student student) {
		String query="INSERT INTO details VALUES (?,?)";
		StudentRepo repo=new StudentRepoImpl();
		int count =repo.AddQuery(query, student);
		if(count==1)
			return true;
		else
			return false;
		
	}
	
	
	//Updating element in the table
	public Student UpdateStudent(Student student) {
		String query="UPDATE details SET name = ? WHERE (uid = ?)";
		StudentRepo repo=new StudentRepoImpl();
		int count =repo.UpdateQuery(query, student);
		if(count==1) 
		{
			Student s=GetStudent(student.getUid());
			return s;
		}
			
		else
			return null;		
	}	
}
