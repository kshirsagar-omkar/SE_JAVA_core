import java.io.*;
import java.util.Arrays;


public class CopyOf
{
	public static void main(String []args)
	{
		System.out.println("\n");



		int a[] = new int[10];
		int b[] = new int[]{1,2,3};


		Arrays.fill( a, 77 );
		System.out.println( Arrays.toString(a) );

		

		System.out.println( b );

		b = Arrays.copyOf(a,2);
		
		System.out.println( b );
		System.out.println( Arrays.toString(b) + " " + b.length );


		
	

		System.out.println("\n");

	}
}