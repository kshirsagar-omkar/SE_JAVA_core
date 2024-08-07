import java.io.*;
import java.util.Scanner;

public class AdditionOfTwoNumbersUsingBR
{
	public static void main(String []args) throws Exception //BufferedReader la exception yeti jr input denara keyboard kharab asla tr
	{
		System.out.println();
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ); //It is like JCB ch Khora (atta ip keyboar kadun ghetay Nnter File Kadun Ghenar)
		
		int firstIntegerNumber = 0;
		int secondIntegerNumber = 0;

		System.out.print("Enter First Integer Number : ");
		firstIntegerNumber = Integer.parseInt( br.readLine() );

		System.out.print("Enter Second Integer Number : ");
		secondIntegerNumber = Integer.parseInt( br.readLine() );
		
		int ans = firstIntegerNumber + secondIntegerNumber;
		
		System.out.println("Addition : " + ans);

	}
}
