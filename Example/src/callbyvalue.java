
/*public class callbyvalue
{
	static void eating()
	{
		System.out.println("Eating..........");
	}
	void sleeping()
	{
		System.out.println("Sleeping..........");
	}
	public static void main(String[] args)
	{
		eating();
	}
}
*/

/*class callbyvalue
{
	int data=50;
	void change(int data)
	{
		data=data+100;
	}
	public static void main(String[] args)
	{
		callbyvalue cv=new callbyvalue();
		System.out.println("before change"+cv.data);
		cv.change(500);
		System.out.println("after change"+cv.data);
	}
}
*/

class callbyvalue
{
	int data=50;
	void change(callbyvalue cv)
	{
		cv.data=cv.data+100;
	}
	public static void main(String[] args)
	{
		callbyvalue cv=new callbyvalue();
		System.out.println("before change"+cv.data);
		cv.change(cv);
		System.out.println("after change"+cv.data);
	}
}