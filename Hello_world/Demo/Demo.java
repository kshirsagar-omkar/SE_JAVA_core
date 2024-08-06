import java.io.*;

public class Demo
{
	public static void main(String []args)
	{
		System.out.println("Hello World!");
		A.main(null);
	}
}

class B{}

class A
{
	public static void main(String []args)
	{
		System.out.println("Bye");
	}
}