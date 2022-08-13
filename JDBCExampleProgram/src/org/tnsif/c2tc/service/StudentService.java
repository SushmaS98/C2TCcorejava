package org.tnsif.c2tc.service;

import java.util.List;
import org.tnsif.c2tc.entities.Student;

public interface StudentService {
	public Student GetStudent(int uid);

	public List<Student> GetStudents();

	public boolean DeleteStudent(int nextInt);

	public boolean AddStudent(Student student);

	public Student UpdateStudent(Student student);

}
