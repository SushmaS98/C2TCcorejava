package org.tns.c2tc;

import java.util.Scanner;

import org.tns.c2tc.entities.Laptop;
import org.tns.c2tc.entities.Student;
import org.tns.c2tc.service.StudentService;
import org.tns.c2tc.service.StudentServicesImpl;

public class Client
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		StudentService service=new StudentServicesImpl();
		do
		{
			System.out.println("Enter the choice"
					+ "\n1: Adding a value"
					+ "\n2: Fetching the deatils"
					+ "\n3: Updating the details"
					+ "\n0: Exit"
					);
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: //To get data
			{
				System.out.println("Enter the details");
				Student student=new Student(sc.nextInt(),sc.next());
				service.addStudent(student);
				Laptop laptop=new Laptop(1,"HP");
				laptop.setStudent(student);
				Laptop laptop2=new Laptop(2,"Acer");
				laptop2.setStudent(student);
				Laptop laptop3=new Laptop(3,"Lenovo");
				laptop3.setStudent(student);
				service.addLaptop(laptop);
				service.addLaptop(laptop2);
				service.addLaptop(laptop3);
				student.getLaptop().add(laptop);
				student.getLaptop().add(laptop2);
				student.getLaptop().add(laptop3);			
			}
			break;
			
			case 2 :
			{
				System.out.println("Enter the uid of the studnet");
				Student student=new Student();
				student.setUid(sc.nextInt());
				Student s=service.getStudent(student.getUid());
				System.out.println(s);
			}
			break;
			
			case 3:
			{
				Student student=new Student();
				System.out.println("Enter the uid to update details");
				student.setUid(sc.nextInt());
				System.out.println("Enter the updated details");
				sc.nextLine();
				student.setName(sc.nextLine());
				Student s=service.updateStudent(student);
				System.out.println(s);
			}
			break;

			case 0:
			{
				System.out.println("Thank You");
			}
				
				break;
				
				default:
					System.out.println("Incorrect option");
					break;
			}
		}
		while(choice!=0);
	}
}
