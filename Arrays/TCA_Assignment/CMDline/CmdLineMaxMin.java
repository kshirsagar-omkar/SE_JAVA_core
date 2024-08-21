import java.io.*;
import java.util.Arrays;

public class CmdLineMaxMin
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("\n");

		if(args.length == 0)
		{
			System.out.println("No Aruiments Pass From CMD Line!!!\n");
			System.exit(0);
		}

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		System.out.println( Arrays.toString(args) + "\n" );	

		byte option = 0;
		System.out.print("What Do You Want To Find Min(1) / Max(2) : ");
		option = Byte.parseByte( br.readLine() );

		if(option == 1)
		{
			int min = Integer.parseInt( args[0] );
			for(int i=1; i<args.length; ++i)
			{
				int currentElement = Integer.parseInt( args[i] );
				if(currentElement < min) min = currentElement;
			}
			System.out.println("Min : " + min);
		}
		else if(option == 2)
		{
			int max = Integer.parseInt( args[0] );
			for(int i=1; i<args.length; ++i)
			{
				int currentElement = Integer.parseInt( args[i] );
				if(currentElement > max) max = currentElement;
			}
			System.out.println("Max : " + max);
		}

		System.out.println("\n");		
	}
}