import java.io.*;

public class ReferenceDataType
{
	public static void main(String []args)
	{
		System.out.println("\n");

		char a[] = new char[3];

		System.out.println(a.toString());
		System.out.println(a.hashCode());

		/*
		a[0] = 11;
		a[1] = 22;
		a[2] = 33;

		System.out.println( a[0] + " " + a[1] + " " + a[2] );
		*/
	}
}