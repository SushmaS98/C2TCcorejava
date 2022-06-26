import java.util.Scanner;
public class string
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		System.out.println(A.length()+B.length());
		if(A.compareTo(B)>=0)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println(A.substring(0,1).toUpperCase()+
				A.substring(1)+" "+Character.toUpperCase(B.charAt(0))+
				B.substring(1));	                 
	}
}


/*public class Main 
{
	public static void main(String[] args) 
	{
		String str="Hello";
		String str1="Hello";
		String str2=new String("Hello");
		System.out.println(str==str1);
		System.out.println(str==str2);
	}

}
*/

/*public class string
{
	public static void main(String[] args) 
	{
		String s1="Hello";
		String s2="JAVA";
		System.out.println("String length is:"+s1.length());
		System.out.println("String length is:"+s2.length());
	}
}
*/
/*public class string
{
	public static void main(String args[])
	{
		String str="hello";
		String str1="hello";
		String str2=new String("hello");
		System.out.println(str==str1);
		System.out.println(str==str2);
	}
}
*/
/*public class string
{
	public static void main(String args[])
	{
		String str="Programming";
		System.out.println(str.length());
		String s="Let's continue";
		System.out.println(s.length());
	}
}
*/

/*public class string
{
	public static void main(String args[])
	{
		String s="Are", t="you", u="ready";
		System.out.println(s+t+u);
		System.out.println(s.concat(t));
	}
}
*/

/*public class string
{
	public static void main(String args[])
	{
		String s=50+50+"error"+50+50;
		System.out.println(s);
	}
}
*/

/*public class string
{
	public static void main(String args[])
	{
		String s="Apple";
		int a=10;
		System.out.println(s+a);
		System.out.println(s.concat(a));
	}
}
*/

/*public class string
{
	public static void main(String args[])
	{
		String s="Great", t="";
		String u=s.concat(t);
		if(u==s)
			System.out.println("same");
		else
			System.out.println("not same");
		String e=s+t;
		if(e==s)
			System.out.println("same");
		else
			System.out.println("not same");
	}
}
*/

/*public class string
{
	public static void main(String args[])
	{
		String str="techno@serve@India";
		String[] arrOfStr=str.split("@",2);
		for (String a : arrOfStr)
			System.out.println(a);
	}
}
*/


