class person
{
	int id;
	void printID(int id)
	{
		System.out.println("ID:"+id);
	}
}
class Student extends person
{
	void iden()
	{
		System.out.println("Student's");
	}
}
class teacher extends person
{
	void iden()
	{
		System.out.println("Teacher's");
	}
}
public class inheritance
{
	public static void main(String[] args)
	{
		Student s= new Student();
		s.iden();
		s.printID(11701200);
		teacher t=new teacher();
		t.iden();
		t.printID(11020);
	}
}



/*class person
{
	int id;
	void printID(int id)
	{
		System.out.println("ID:"+id);
	}
}
class Student extends person
{
	void iden()
	{
		System.out.println("Student's");
	}
}
class teacher extends person
{
	void iden()
	{
		System.out.println("Teacher's");
	}
}
public class inheritance
{
	public static void main(String[] args)
	{
		Student s= new Student();
		s.iden();
		s.printID(11701200);
		clark c=new clark();
		c.iden();
		c.printID(1203);
		teacher t=new teacher();
		t.iden();
		t.printID(11020);
	}
}
*/

/*Hierarchical Inheritance
import java.util.*;
class Flower
{
	void colour()
	{
		System.out.println("Based on Flower");
	}
}
class Red extends Flower
{
	void colour1()
	{
		System.out.println("Blood");
	}
}
class Blue extends Red
{
	void colour2()
	{
		System.out.println("Sky");
	}
}
public class inheritance
{
	public static void main(String[] args)
	{	
		Blue d= new Blue();
		d.colour2();
		d.colour1();
		d.colour();
	}
}
*/

/* Single Inheritance
class Animal
{
	void Animals()	
	{
	System.out.println("it belongs to animal");
	}
}
class pet extends Animal
{
	void PetAnimals(String x)
	{
		System.out.println(x + " is a pet");
	}
}
public class inheritance
{
	public static void main(String[] args)
	{	
		pet dog=new pet();
		dog.PetAnimals("Dog");
		dog.Animals();
	}

}
*/