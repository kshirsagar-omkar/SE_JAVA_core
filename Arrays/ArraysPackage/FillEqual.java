import java.io.*;
import java.util.Arrays;


public class FillEqual
{
	public static void main(String []args)
	{
		System.out.println( "\n" );



		int a[] = new int[10];
		int b[] = new int[]{1,2,3};


		Arrays.fill( a, 77 );

		System.out.println( Arrays.toString(a) );
		System.out.println( Arrays.toString(b) );


		
		if( Arrays.equals(a,b) )
		{
			System.out.println("Yes Arrays Are Equal");
		}
		else
		{
			System.out.println("Yes Arrays Are NOT Equal");
		}

		System.out.println( "\n");

	}
}