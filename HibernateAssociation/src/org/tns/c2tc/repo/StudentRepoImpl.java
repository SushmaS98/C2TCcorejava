package org.tns.c2tc.repo;

import javax.persistence.EntityManager;

import org.tns.c2tc.entities.Laptop;
import org.tns.c2tc.entities.Student;

public class StudentRepoImpl implements StudentRepo {

EntityManager entityManager;
	
	public StudentRepoImpl()
	{
		Configuration.getEntityManagerFactory();
		entityManager=Configuration.getEntityManager();
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void endTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public Student getStudent(int uid) {
		Student student=entityManager.find(Student.class, uid);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		Student s=entityManager.merge(student);
		return s;
	}

	@Override
	public void deleteStudent(int uid) {
		Student student=entityManager.find(Student.class,uid);
		entityManager.remove(student);
		
	}

	@Override
	public void addLaptop(Laptop laptop) {
		entityManager.persist(laptop);
	}

}