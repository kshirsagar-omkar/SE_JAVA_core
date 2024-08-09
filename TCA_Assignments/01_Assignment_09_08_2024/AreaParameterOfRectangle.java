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
		float base_of_rectangle = 0; 
		float height_of_rectangle = 0; 
		float area_of_rectangle = 0;
		float parameter_of_rectangle = 0;

		/*Accepting Values For Further Calculations*/
		System.out.print("Enter Base (width) of Rectangle : ");
		base_of_rectangle = Float.parseFloat( br.readLine() );

		System.out.print("Enter Height (length) of Rectangle : ");
		height_of_rectangle = Float.parseFloat( br.readLine() );

		if(base_of_rectangle > 0 && parameter_of_rectangle > 0)
		{

			/*Calculating Area Of Rectangle*/
			area_of_rectangle = base_of_rectangle * height_of_rectangle;

			/*Calculating Parameter Of Rectangle*/
			parameter_of_rectangle = 2 * ( base_of_rectangle + height_of_rectangle );

			System.out.println();

			System.out.println("Area of Rectangle 	: " + area_of_rectangle);
			System.out.println("Parameter of Rectangle 	: " + parameter_of_rectangle);
		}
		else 
		{
			System.out.println("\nInvalid Inputs!!");
		}
		System.out.println();
	}
}