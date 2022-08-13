/*This program will demonstrate Student class, user input will be given*/

package org.tnsif.c2tc;

import java.util.List;
import java.util.Scanner;
import org.tnsif.c2tc.entities.Student;
import org.tnsif.c2tc.service.StudentService;
import org.tnsif.c2tc.service.StudentServicesImpl;

public class StudentApplication
{
	public static void main(String[] args) throws Exception {
		int choice;
		
		StudentService service=new StudentServicesImpl();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter the choice"
					+ "\n1: Retrieve a particular student"
					+ "\n2: Retrieve all students"
					+ "\n3: Delete a student"
					+ "\n4: Insert a student"
					+ "\n5: Update a student"
					+ "\n-1: Exit"
					);
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the uid of the student whose details are required");
				Student student;
				try{
					student= service.GetStudent(sc.nextInt());
				}
				catch(Exception e)
				{
					student=null;
				}
				if(student!=null)
					System.out.println(student);
				else
					System.out.println("Student details not found or error in Configuration");
			}
			break;
			case 2:
			{
				List<Student>students= service.GetStudents();
				//System.out.println(students);
				for (Student s: students)
					System.out.println(s);
			}
			break;
			case 3:
			{
				System.out.println("Enter the uid you want to delete");
				boolean success = service.DeleteStudent(sc.nextInt());
				if(success)
					System.out.println("Student was deleted sucessfully");
				else
					System.out.println("Details not found");
			}
			break;
			case 4:
			{
				
				System.out.println("Enter the details of the student");
				Student student=new Student(sc.nextInt(),sc.next());
				if(service.AddStudent(student))
					System.out.println("Added Successfully");
				else
					System.out.println("There was a problem in creation");
			}
			break;
			case 5:
			{
				System.out.println("Enter the uid of the student whose details you want to update");
				Student student=new Student();
				student.setUid(sc.nextInt());
				System.out.println("Enter the updated details");
				sc.nextLine();
				student.setName(sc.nextLine());
				Student s= service.UpdateStudent(student);
				if (s!=null)
					System.out.println(s);
				else
					System.out.println("Student not found");
			}
			break;
			case -1:
				System.out.println("Thank You");
			break;
			default:
				System.out.println("Choose a correct option");
				break;
			}
		}
		while (choice>0);
		
	}
}