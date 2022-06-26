/*Static Example

import java.util.*;
public class Main
{
	static int a=10;
     public static void main(String[] args) 
     {
    	System.out.println(a);
    }

}
Ans:10
*/
/*import java.util.*;
public class Main
{
     public static void main(String[] args) 
     {
    	 
        int x=20;
    	System.out.println(" "+x);
    }
     static
     {
    	 int x=10;
     	System.out.println(" "+x); 
     }
}
ans: 10 20
*/
/*import java.util.*;
public class Main
{
     int x=10;	
     public static void main(String[] args) 
     {
    	System.out.println(x);
    }
     static
     {
    	 System.out.println(x);
     }
}
ans: compilation error
*/
/*import java.util.*;
public class Main
{
     int x=10;	
     public static void main(String[] args) 
     {
    	 Main t1=new Main();
    	System.out.println(t1.x);
    }
     static
     {
    	 int x=20;
    	 System.out.println(x+" ");
     }
}
ans: 20 10
*/
/*import java.util.*;
public class Main
{
     static int x=10;	
     public static void main(String[] args) 
     {
    	 Main t1=new Main();
    	 Main t2=new Main();
    	 t1.x=20;
    	 System.out.println(t1.x+" ");
    	 System.out.println(t2.x);
     }
}
ans: 20 20
*/
/*class Account
{
	int a;
	int b;
	public void setdata(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void showdata()
	{
		System.out.println("Value of A= "+a);
		System.out.println("Value of B= "+b);
	}
}
public class Main
{
	public static void main(String args[])
	{
		Account obj= new Account();
		obj.setdata(4, 9);
		obj.showdata();
	}
}
ans: Value of A= 4
     Value of B= 9 	
*/
/*public class Main
{
	int a;
	Main()
	{
		this(10);
		System.out.println("Inside default constructor\n");
	}
	Main(int a)
	{
		this.a=a;
		System.out.println("Inside parameterized constructor\n");
	}
	public static void main(String[] args)
	{
		Main object= new Main();
	}
}
ans: Inside parameterized constructor

     Inside default constructor
 */
/*public class Main
{
	String a;
	Main()
	{
		a=" I am inevitable";
	}
	Main get()
	{
		return this;
	}
	void display()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Main object= new Main();
        object.get().display();
	}
}
ans: I am inevitable
*/
/*class Test
{
	String str;
	Test()
	{
		str="valar morghulis";
	}
	void display(Test obj)
	{
		System.out.println(str);
	}
	void get()
	{
		display(this);
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Test object=new Test();
		object.get();
	}
}
ans: valar morghulis
*/	
/*class Test
{
	void display()
	{
		this.show();
		System.out.println("Captain Steve Rogers");
	}
	void show()
	{
		System.out.println("I can do this all day");
	}
}
public class Main
{
	public static void main(String args[])
	{
		Test t1=new Test();
		t1.display();
	}
}
ans: I can do this all day
     Captain Steve Rogers
*/
