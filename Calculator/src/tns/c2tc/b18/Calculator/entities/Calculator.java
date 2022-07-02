package tns.c2tc.b18.Calculator.entities;

 public class Calculator 
{
	public static int power(int n,int p) throws Exception
	{
		if(n<0 || p<0)
		{
			throw new Exception("n or p should not be negative.");
		}
		else if(n==0 && p==0)
		{
			throw new Exception("n or p should not be zero.");
		}
		else
		{
			return(int)Math.pow(n, p);
		}
	}
}
