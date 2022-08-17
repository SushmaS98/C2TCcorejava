package org.tns.c2tc.service;

import org.tns.c2tc.entities.Laptop;
import org.tns.c2tc.entities.Student;
import org.tns.c2tc.repo.StudentRepo;
import org.tns.c2tc.repo.StudentRepoImpl;

public class StudentServicesImpl implements StudentService
{

	StudentRepo repo;
	
	public StudentServicesImpl()
	{
		repo=new StudentRepoImpl();
	}

	@Override
	public void addStudent(Student student) {
		repo.beginTransaction();
		repo.addStudent(student);
		repo.endTransaction();
		
	}

	@Override
	public Student getStudent(int uid) {
		Student student =repo.getStudent(uid);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		repo.beginTransaction();
		Student s=repo.updateStudent(student);
		repo.endTransaction();
		return s;
	}

	@Override
	public void deleteStudent(int uid) {
		repo.beginTransaction();
		repo.deleteStudent(uid);
		repo.endTransaction();
	}

	@Override
	public void addLaptop(Laptop laptop) {
		repo.beginTransaction();
		repo.addLaptop(laptop);
		repo.endTransaction();
		
	}
}