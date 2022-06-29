class Person
{
	Person()
	{
		System.out.println("Person class constructor");
	}
}
class Student extends Person
{
	Student()
	{
		super();
		System.out.println("Student class constructor");
	}
}
public class Super
{
	public static void main(String args[])
	{
		Student s= new Student();
	}
}


/*class Person
{
	void message()
	{
		System.out.println("This is person class");
	}
}
class Student extends Person
{
	void message()
	{
		System.out.println("This is student class");
	}
	void display()
	{
		message();
		super.message();
	}
}

class Super
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.display();
	}
}
*/

/*class Vehicle
{
	int maxSpeed=120;
}
class Car extends Vehicle
{
	int maxSpeed=180;
	void display()
	{
		System.out.println("Maximum Speed: "+super.maxSpeed);
	}
}
 class Super
{
	public static void main(String[] args)
	{
		Car small=new Car();
		small.display();
	}
}
*/