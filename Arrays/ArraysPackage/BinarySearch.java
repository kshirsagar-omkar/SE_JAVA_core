import java.io.*;
import java.util.Arrays;

public class BinarySearch
{
	public static void main(String []args) throws Exception
	{
		System.out.println("\n");

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int a1[] = new int[10];
		for(int i=0; i< a1.length; ++i)
		{
			System.out.print("Enter Number : ");
			a1[i] = Integer.parseInt( br.readLine() );
		} 

		Arrays.sort(a1);

		System.out.println("Array : " + Arrays.toString( a1 ));



		System.out.print("Enter Element To Search : ");
		int key = Integer.parseInt( br.readLine() );
		int pos = Arrays.binarySearch( a1, key );

		if(pos >= 0)
		{
			System.out.println("Element Found at " + pos + " Index");
		}
		else
		{
			System.out.println("Element Not Found!!! but if element is present then it will be : " + pos);
		}	

		System.out.println("\n");
	}
}