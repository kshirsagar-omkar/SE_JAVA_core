import java.io.*;
import java.util.Arrays;

public class OneDimentionalArray
{
	public static void main(String []args)
	{
		int a0[] = new int[]{11,22,33,44};

		int a1[] = {44,55,66};

		int a2[] = new int[8];

		int a3[] = null;

		System.out.println(a0+" "+a0.length+"\n");
		System.out.println(a1+" "+a1.length+"\n");
		System.out.println(a2+" "+a2.length+"\n");
		System.out.println(a3+" "+"\n");

		/*
			System.out.println(a3+" "+a3.length+"\n");

			Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<local4>" is null
        	at OneDimentionalArray.main(OneDimentionalArray.java:19)

		*/


		System.out.println( Arrays.toString(a0) );
	}
}