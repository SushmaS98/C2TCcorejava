package org.tns.c2tc.repo;

import org.tns.c2tc.entities.Student;

public interface StudentRepo {

	void addStudent(Student student);

	void startTransaction();

	void endTransaction();

	Student getStudent(int rollno);

	Student updateStudent(Student student);

}
