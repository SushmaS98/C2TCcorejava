
/*public class student 
{
		
		public student(int rollno, String name, String batch_name) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.batch_name = batch_name;
	}
		int rollno;
		String name;
		String batch_name;
		void display()
		{
			System.out.println(rollno);
			System.out.println(name);
			System.out.println(batch_name);
		}

	}
*/
public class student
{
	int rollno=29;
	String name="Sushma";
	static String batch_name="C2TC";
	Branch branch= Branch.MCA;
	public student()
	{
	}
	public student(int rollno, String name, String batch_name)
	{
		this.rollno = rollno;
		this.name = name;
		this.batch_name = batch_name;
	}
	void display()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(batch_name);
		System.out.println(branch);
	}
	
}

