package org.tns.c2tc.service;

import org.tns.c2tc.entities.Student;
import org.tns.c2tc.repo.StudentRepo;
import org.tns.c2tc.repo.StudentRepoImpl;

public class StudentServiceImpl implements StudentService
{
	StudentRepo repo;
	
	public StudentServiceImpl()
	{
		repo=new StudentRepoImpl();
	}
	@Override
	public void addStudent(Student student)
	{
		repo.startTransaction();
		repo.addStudent(student);
		repo.endTransaction();
	}
	
	public Student getStudent(int rollno)
	{
		Student student=repo.getStudent(rollno);
		return student;
	}
	@Override
	public Student updateStudent(Student student) {
		repo.startTransaction();
		Student s=repo.updateStudent(student);
		repo.endTransaction();
		return s;
	}
}
