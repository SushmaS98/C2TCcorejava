package org.tns.c2tc.repo;

import org.tns.c2tc.entities.Laptop;
import org.tns.c2tc.entities.Student;

public interface StudentRepo
{
	public void addStudent(Student student);
	public void beginTransaction();
	public void endTransaction();	
	public Student getStudent(int uid);
	public Student updateStudent(Student student);
	public void deleteStudent(int uid);
	public void addLaptop(Laptop laptop);

}
