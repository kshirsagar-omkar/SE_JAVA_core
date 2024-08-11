/*
	Author : Omkar Kshirsagar
	Language : JAVA
	Date : 11/08/2024

	Problem Statement : Write a JAVA program to accept dimensions of Cylender and print
	the Surface Area And Volume

	->
		Surface Area = (2 * PI * r^2) + (2 * PI * r * h)
		Volume = PI * r^2 * h

*/

import java.io.*;


public class CylenderSurfaceAreaAndVolume
{
	public static void main(String []args) throws Exception
	{
		System.out.println("\n");

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );


		/*Variables For Calculations*/
		float PI = Float.parseFloat("3.14159265359");
		float CylenderRadius = 0;
		float CylenderHeight = 0;
		float CylenderSurfaceArea = 0;
		float CylenderVolume = 0;


		/*Accepting Radius And Height Of Cylender*/

		System.out.print("Enter Radius of Cylender : ");
		CylenderRadius = Float.parseFloat( br.readLine() );

		System.out.print("Enter Height of Cylender : ");
		CylenderHeight = Float.parseFloat( br.readLine() );		


		/*Calculating Surface Area And Volume Of Cylender*/

		CylenderSurfaceArea = ( 2 * PI * ( CylenderRadius * CylenderRadius ) ) + ( 2 * PI * CylenderRadius * CylenderHeight );
		CylenderVolume = ( PI * ( CylenderRadius * CylenderRadius ) * CylenderHeight );


		/*Printing The Results*/

		System.out.println("\n");
		System.out.println("Surface Area of Cylender : " + CylenderSurfaceArea + " square units");
		System.out.println("Volume of Cylender       : " + CylenderVolume + " cubic units");

		System.out.println("\n");
	}
}