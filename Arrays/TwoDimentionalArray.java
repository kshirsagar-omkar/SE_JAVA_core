import java.io.*;
import java.util.Arrays;


public class TwoDimentionalArray
{
	public static void main(String []args)
	{
		System.out.println("\n");


		int a[][] = new int[3][];
		a[0] = new int[3];
		a[1] = new int[1];
		a[2] = new int[2];

		int a1[][] = {{12,12},{21,21}};

		// Arrays.sort( a1[0] );

		System.out.println( Arrays.toString( a1 ) );

	}
}