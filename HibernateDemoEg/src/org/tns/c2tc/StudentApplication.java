/*This program will demonstrate Student class user input will be given*/ 


/*
package org.tns.c2tc;
import java.util.Scanner;
import org.tns.c2tc.entities.Student;
import org.tns.c2tc.service.StudentService;
import org.tns.c2tc.service.StudentServiceImpl;
public class StudentApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StudentService service=new StudentServiceImpl();
		//update
		System.out.println("Enter the details");
		int uid=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		Student student=new Student(uid,name);
		student.setUid(sc.nextInt());
		student=service.updateStudent(student);
		System.out.println(student);
	}
}
*/


/*
package org.tns.c2tc;
import java.util.Scanner;
import org.tns.c2tc.entities.Student;
import org.tns.c2tc.service.StudentService;
import org.tns.c2tc.service.StudentServiceImpl;
public class StudentApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StudentService service=new StudentServiceImpl();
		//retrieve
		System.out.println("Enter the uid of the student");
		Student student=new Student();
		//student.setUid(sc.nextInt());
		student=service.getStudent(sc.nextInt());
		System.out.println(student);
	}
}
*/


/*
package org.tns.c2tc;
import java.util.Scanner;
import org.tns.c2tc.entities.Student;
import org.tns.c2tc.service.StudentService;
import org.tns.c2tc.service.StudentServiceImpl;
public class StudentApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StudentService service=new StudentServiceImpl();
		//retrieve
		System.out.println("Enter the details");
		Student student=new Student(sc.nextInt(),sc.next());
		service.addStudent(student);
	}
}
*/



/*Storing values*/         
package org.tns.c2tc;
import java.util.Scanner;
import org.tns.c2tc.entities.Student;
import org.tns.c2tc.service.StudentService;
import org.tns.c2tc.service.StudentServiceImpl;
public class StudentApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StudentService service=new StudentServiceImpl();
		//To Store value
		System.out.println("Enter the details");
		Student student=new Student(sc.nextInt(),sc.next());
		service.addStudent(student);
	}
}
