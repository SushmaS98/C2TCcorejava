
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		int i=0;
		int size=sc.nextInt();
		int arr[]=new int[size];
		for( i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		for( i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Elemnt is found at "+(i+1));
		}
		else
		{
			System.out.println("Elemnt is found");
		}
	}

}



/* import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		int pos=-1;
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				flag=true;
				pos=i;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Elemnt is found at "+(pos+1));
		}
		else
		{
			System.out.println("Elemnt is found");
		}
	}

}
*/

/*import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		arr[i]=sc.nextInt();
		for(int i=0;i<size;i++)
		{
		    if(arr[i]==key)
		      System.out.println("position of " +key +"is " +(i+1));
		      else
		      System.out.println("element not found");
		 }
		 
     }
} 
*/	
/*import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
	{ 
    	int i,number;
	     Scanner s=new Scanner(System.in);
	     number=s.nextInt();
	     int array[]=new int[number];
	     for(i=0;i<number;i++)
	     {
	    	 array[i]=s.nextInt();
	     }
	     for(i=0;i<number;i++)
	     {
	    	 System.out.println(array[i]);
	     }
	}
}
*/
/*import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
	{ 
    	int i,j;
    	Scanner s=new Scanner(System.in);
    	int row=s.nextInt();
    	int col=s.nextInt();
    	int arr[][]=new int[row][col];
    	for(i=0;i<row;i++)
    	{
    		for(j=0;j<col;j++)
    		{
    			arr[i][j]=s.nextInt();
    		}
    	}
    	for(i=0;i<row;i++)
    	{
    		for(j=0;j<col;j++)
    		{
    			System.out.println(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
	}
}
*/
/*public class Main
{
	public static void main(String [] args)
	{
		int row=2, col=3;
		int[][] matrix= {
				           {2,3,4},
				           {5,6,7}
		                 };
		display(matrix);
		int[][] transpose= new int[col][row];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				transpose[j][i]= matrix[i][j];
			}
		}
		display(transpose);
	}
	public static void display(int[][] matrix)
	{
		System.out.println("The matrix is: ");
		for(int[] row : matrix)
		{
			for(int column : row)
			{
				System.out.print(column + "   ");
			}
			System.out.println();
	    }
		
	}
}
*/
/* Transpose of a Matrix*/

/*
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for( int i=0;i<row;i++)
    	{
    		for(int j=0;j<col;j++)
    		{
    			arr[i][j]=sc.nextInt();
    		}
    	}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0)
					System.out.print(arr[j][i]);
				else
				    System.out.print(","+arr[j][i]);
			}
			System.out.println();
		}
	}
}
*/



