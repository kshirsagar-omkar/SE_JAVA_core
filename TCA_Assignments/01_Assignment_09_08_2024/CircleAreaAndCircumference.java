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
		
		float PI = 3.14f;
		float circleRadious = 0;
		float circleArea = 0;
		float circleCircumference = 0;


		/*Accepting Values : */
		System.out.print("Enter Radios of : ");
		circleRadious = Float.parseFloat( br.readLine() );
		


		/*Calculating Area And Circumference*/
		circleArea = PI * circleRadious * circleRadious;
		circleCircumference = 2 * circleRadious * PI;


		/*Displaying Results*/
		System.out.println("\n");
		System.out.println("Area Of a Circle          : " + circleArea);
		System.out.println("Circumference Of a Circle : " + circleCircumference);
		System.out.println("\n");
	}
}