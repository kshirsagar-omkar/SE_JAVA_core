import java.lang.*;



abstract class A
{
	abstract public void disp();
	abstract public void show();
}


/*
class B extends A
{
	public void disp()
	{
		System.out.println("disp : RED");
	}
}
*/



public class Annonymous 
{
	public static void main(String []args)
	{
	/*   B bob = new B();

		 bob.disp();
	*/
	
		A aob = new A()
		{
			public void disp()
			{
				System.out.println("disp : RED");
			}
			public void show()
			{
				System.out.println("show : GREEN");
			}
		};

		aob.disp();
		aob.show();

	} 
}