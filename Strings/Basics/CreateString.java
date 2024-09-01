import java.io.*;
import java.util.*;

public class CreateString
{
	public static void main(String []args)
	{
		String S = "Omkar";
		String T = new String("Kshirsagar");

		System.out.println(S);
		System.out.println(T);

		S = S+T;

		System.out.println(S);


		System.out.println("\n");


		//Refrence is Comparing Here
		System.out.println("S==T " + (S==T));


		//Still Reference is checking here 
		//NOTE  This String is Made on StringConstantPool
		//Here P AND Q Are Sharing Same Reference 
		String Q = "Omkar";
		String P = "Omkar";
		System.out.println("Q==P " + (Q==P));

		/*S[0]='o';		//NO You Cant Do It  :: Error*/




		/* Below is MUTABLE string AND Above is Immutable */

		//if MultiThreaded Application
		StringBuffer SBuf = new StringBuffer("Omkar");

		//If MultiThread Is Not Used The You Can use Both
		StringBuilder SBul = new StringBuilder("Vaibhav");

		//SBuf[0]='o';		//Yes You Can Do It
		SBuf.setCharAt(0, '0'); //Yes You Can Do It





	}
}



/*
		int JAVA STRINGS are immutable

		in above code S = S+T

		tr ethe S Ya Object madhe navin Reference stor jhala jo ki HEAP vr parat banla asel (S+T)
	
*/