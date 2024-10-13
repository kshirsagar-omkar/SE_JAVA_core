import java.lang.*;
import java.io.*;




public class Addition
{
	public static void main(String []args)
	{


		double firstNum = 0;
		double secondNum = 0;
		double answer = 0;

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );


		try{

			System.out.print("Enter First Number : ");
			firstNum = Double.parseDouble(br.readLine());

			System.out.print("Enter Second Number : ");
			secondNum = Double.parseDouble(br.readLine());


			answer = firstNum + secondNum;
			System.out.println("Addition : " + answer);

		}

		catch(NumberFormatException nfe)
		{
			System.out.println("Conversion Error!!!\nInput must be 'DOUBLE'!!");
		}
		catch(IOException ioe)
		{
			System.out.println("IO Exception!!");
			ioe.printStackTrace();
		}

		catch(Exception E){

			System.out.println("Unknown Error !!!" + E.getMessage() );
			
			E.printStackTrace();
		}







		System.out.println("Ending Application...." );

	}
}