import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int key=sc.nextInt();
		for(int i=0;i<size;i++)
			if(arr[i]!=key)
				System.out.println(arr[i]);				
	}
}



/*import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int size,loc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements in Array : ");
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();
		loc=sc.nextInt();
		for(int i=0;i<size;i++)
			if(a[i]!=loc)
				System.out.println(a[i]);
	}
}
*/