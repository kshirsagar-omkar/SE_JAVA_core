import java.io.*;
import java.util.Scanner;

public class AdditionOfTwoNumbersUsingSC
{
	public static void main(String []args)
	{
		System.out.println();
	
		// BufferedReader br = new BufferedReader ( new InputStreamReader( System.in ) );
		Scanner sc = new Scanner( System.in );

		float firstFloatNumber = 0;
		float secondFloatNumber = 0;
		float answer;

		System.out.print("Enter First Float Number : ");
		firstFloatNumber = sc.nextFloat();

		System.out.print("Enter Second Float Number : ");
		secondFloatNumber = sc.nextFloat();

		System.out.println("Addition : " + (firstFloatNumber+secondFloatNumber) );
	}
}
