package org.tns.c2tc.service;

import org.tns.c2tc.entities.Laptop;
import org.tns.c2tc.entities.Student;

public interface StudentService 
{
public void addStudent(Student student);
	
	public Student getStudent(int uid);

	public Student updateStudent(Student student);

	public void deleteStudent(int uid);

	public void addLaptop(Laptop laptop);


}
