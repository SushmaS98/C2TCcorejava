package tns.c2tc.b18.Calculator;
import tns.c2tc.b18.Calculator.entities.Calculator;
import java.util.Scanner;

public class Main
{
	public static final Calculator calculator=new Calculator();
	public static final Scanner in=new Scanner(System.in);
	public static void main(String args[])
	{
		while(in.hasNextInt())
		{
			int n=in.nextInt();
			int p=in.nextInt();
			try
			{
				System.out.println(calculator.power(n, p));
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
