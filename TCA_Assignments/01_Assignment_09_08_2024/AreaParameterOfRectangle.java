/*
	Author : Omkar Kshirsagar
	Language : JAVA
	Date : 09/08/2024

	Problem Statement : Write a JAVA program to calculate area and parameter of a rectangle

	->
		To find the area of a rectangle, calculate A = b*h , 
		where is the base (width) and is the height (length). 
		The perimeter of a rectangle will always be P = 2*b + 2*h OR P = 2*(B+H)
*/

import java.io.*;


public class AreaParameterOfRectangle
{
	public static void main(String []args) throws Exception
	{
		System.out.println();

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		/* Variables For Calculating And Storing Results */
		float baseOfRectangle = 0; 
		float heightOfRectangle = 0; 
		float areaOfRectangle = 0;
		float parameterOfRectangle = 0;

		/*Accepting Values For Further Calculations*/
		System.out.print("Enter Base (width) of Rectangle : ");
		baseOfRectangle = Float.parseFloat( br.readLine() );

		System.out.print("Enter Height (length) of Rectangle : ");
		heightOfRectangle = Float.parseFloat( br.readLine() );

		if(baseOfRectangle > 0 && parameterOfRectangle > 0)
		{

			/*Calculating Area Of Rectangle*/
			areaOfRectangle = baseOfRectangle * heightOfRectangle;

			/*Calculating Parameter Of Rectangle*/
			parameterOfRectangle = 2 * ( baseOfRectangle + heightOfRectangle );

			System.out.println();

			System.out.println("Area of Rectangle 	: " + areaOfRectangle);
			System.out.println("Parameter of Rectangle 	: " + parameterOfRectangle);
		}
		else 
		{
			System.out.println("\nInvalid Inputs!!");
		}
		System.out.println();
	}
}