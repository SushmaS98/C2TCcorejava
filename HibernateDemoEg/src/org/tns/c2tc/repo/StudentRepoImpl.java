package org.tns.c2tc.repo;

import javax.persistence.EntityManager;
import org.tns.c2tc.entities.Student;


public class StudentRepoImpl implements StudentRepo 
{
	EntityManager manager;
	
	public StudentRepoImpl()
	{
		manager=Configuration.getEntityManager();
	}

	@Override
	public void addStudent(Student student) 
	{
		manager.persist(student);
	}

	@Override
	public void startTransaction() 
	{
		manager.getTransaction().begin();
	}

	@Override
	public void endTransaction()
	{
		manager.getTransaction().commit();
		
	}

	@Override
	public Student getStudent(int rollno) {
		Student student=manager.find(Student.class,rollno);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		Student s= manager.merge(student);
		return s;
	}
	
}
