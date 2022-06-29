class A
{
	void method()
	{
		System.out.println("From class A");
	}
}
class B extends A
{
	void method()
	{
		System.out.println("From class B");
	}
}
public class Poly
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.method();
		B a2=new B();
		a2.method();
	}
}


/*import java.util.Scanner;
class Area
{
	void findArea(int a)
	{
		System.out.println("Area of square: "+(a*a));
	}
	void findArea(int l,int b)
	{
		int area=l*b;
		System.out.println("Area of rectangle: "+area);
	}
	void findArea(float b,int h)
	{
		float area=(float)(0.5*b*h);
		System.out.println("Area of triangle: "+area);
	}
	void findArea(int b,float h)
	{
		float area=b*h;
		System.out.println("Area of parrallelogram: "+area);
	}
}
public class Poly
{
	public static void main(String[] args)
	{
		Area a=new Area();
		a.findArea(5);
		a.findArea(5,2);
		a.findArea(10f,5);
		a.findArea(5,10);
	}

}
*/