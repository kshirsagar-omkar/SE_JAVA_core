/*
	Author : Omkar Kshirsagar
	Language : JAVA
	Date : 10/08/2024

	Problem Statement : Write a JAVA program to calculat area and circumference of a circle

	->
		Circle Area = PI * r^2
		Circle Circumference = 2 * PI * R
*/
import java.io.*;


public class CircleAreaAndCircumference
{
	public static void main(String []args) throws Exception
	{
		System.out.println();

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		float PI = Float.parseFloat("3.14");
		float circlr_radious = 0;
		float circlr_area = 0;
		float circlr_circumference = 0;


		/*Accepting Values : */
		System.out.print("Enter Radios of : ");
		circlr_radious = Float.parseFloat( br.readLine() );
		


		/*Calculating Area And Circumference*/
		circlr_area = PI * circlr_radious * circlr_radious;
		circlr_circumference = 2 * circlr_radious * PI;


		/*Displaying Results*/
		System.out.println("\n");
		System.out.println("Area Of a Circle          : " + circlr_area);
		System.out.println("Circumference Of a Circle : " + circlr_circumference);
		System.out.println("\n");
	}
}