
import java.util.Arrays;
import java.util.Scanner;
public class Anagram 
{
    public static void main(String[] args) 
    {
    	  Scanner sc=new Scanner(System.in);
    	  String A=sc.next();
    	  String B=sc.next();
    	  char temp;
    	  char arr1[]=A.toLowerCase().toCharArray();
    	  char arr2[]=B.toLowerCase().toCharArray();
    	  if(A.length()!=B.length())
    	  {
    		  System.out.println("Not Anagram");
    	  }
    	  else
    	  {
    		  for(int i=0;i<A.length();i++)
    		  {
    			  for(int j=i+1;j<A.length();j++)
    			  {
    				  if(arr1[i]>arr1[j])
    				  {
    					  temp=arr1[i];
    					  arr1[i]=arr1[j];
    					  arr1[j]=temp;
    				  }
    			  }
    		  }
    		  A=new String(arr1);
    		  Arrays.sort(arr2);
    		  B=new String(arr2);
    		  if(A.equalsIgnoreCase(B))
    			  System.out.println("Anagram");
    		  else
    			  System.out.println("Not Anagram");
    	  }
    }
}


/*public class Anagram 
{
    public static void main(String[] args) 
    {
    	StringBuffer s=new StringBuffer("");
    	System.out.println(s.capacity());
    }
}
*/

/*public class Anagram 
{
    public static void main(String[] args) 
    {
    	StringBuffer s=new StringBuffer("Pokemon");
    	System.out.println(s);
    }
}
*/

/*public class Anagram 
{
    public static void main(String[] args) 
    {
    	String s="Today";
    	StringBuffer sb=new StringBuffer(s.length());
    	System.out.println(sb.capacity());
    }
}
*/


/* public class Anagram 
{
    public static void main(String[] args) 
    {
    	StringBuffer sb=new StringBuffer("Jeva");
    	System.out.println(sb);
    	System.out.println(sb.charAt(1));
    	sb.setCharAt(1, 'a');
    	System.out.println(sb);
    	System.out.println(sb.charAt(1));
    }
}
*/


    		  
    	  
    			  
		

	


