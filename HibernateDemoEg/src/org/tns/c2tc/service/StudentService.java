package org.tns.c2tc.service;

import org.tns.c2tc.entities.Student;

public interface StudentService {

	void addStudent(Student student);

	Student getStudent(int nextInt);

	Student updateStudent(Student student);

}
