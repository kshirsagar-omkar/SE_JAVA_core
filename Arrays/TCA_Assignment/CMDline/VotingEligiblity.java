import java.io.*;
import java.util.Arrays;


public class VotingEligiblity
{
	public static void main(String[] args) 
	{
		System.out.println("\n");

		if(args.length==0)
		{
			System.out.println("Arguiments Not Sent!!\n");
			System.exit(0);
		}

		int countOfEligibleVoitingPersons = 0;

		for(int i=0; i<args.length; ++i)
		{
			if( Byte.parseByte( args[i] ) > 18 ) ++countOfEligibleVoitingPersons;
		}


		System.out.println("Total Persons That Are Eligible : " + countOfEligibleVoitingPersons);	


		System.out.println("\n");	
	}
}