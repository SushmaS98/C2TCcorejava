
public class leapyear
{

	public static void main(String[] args) 
	{
		int year=1996;
		if(year%4==0)
		{
			if(year%100!=0)
				System.out.println("Leap year");
			else
			{
				if(year%400==0)
					System.out.println("Leap year");
				else
					System.out.println("Not Leap Year");
			}
		}
		else
			System.out.println("Not Leap Year");

	}

}

/*
public class Main 
{

	public static void main(String[] args) 
	{
		int year=1900;
		if((year%4==0)&&(year%100!=0) || (year%400==0))
			System.out.println("Leap");
		else
			System.out.println("Not Leap");

	}

}

*/