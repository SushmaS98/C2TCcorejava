
import java.util.Scanner;
class recursion
{
	public static void print_digits(int n)
	{
		if(n<=9)
		{
			System.out.print(n);
		}
		print_digits(n/10);
		System.out.print(n%10);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
				int n=s.nextInt();
		print_digits(n);
	}
}


/*
 * import java.util.Scanner;
 
import java.util.*;
public class recursion
	{
		static int dc(int n)
		{
			if(n<=9)
			{
				return 1;
			}
			else
			{
				return 1+dc(n/10);
			}
		}
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			System.out.print(dc(n));
		}

	}
*/

