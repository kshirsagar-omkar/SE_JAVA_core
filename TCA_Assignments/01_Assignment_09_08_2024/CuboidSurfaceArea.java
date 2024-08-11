/*
	Author : Omkar Kshirsagar
	Language : JAVA
	Date : 09/08/2024

	Problem Statement : Write a JAVA program to accept three dimensions length(l), breadth(b) and
	height(h) of a Cuboid and print Surface Area 

	->
		Surface Area = 2 ( lb + lh + bh )

*/

import java.io.*;


public class CuboidSurfaceArea
{
	public static void main(String []args) throws Exception
	{
		System.out.println();

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		/* Variables For Calculating And Storing Results */
		float lengthOfCuboid = 0;
		float breadthOfCuboid = 0;
		float heightOfCuboid = 0;
		float surfaceAreaOfCuboid = 0;

		/*Accepting Values For Further Calculations*/
		System.out.print("Enter Length of a Cuboid : ");
		lengthOfCuboid = Float.parseFloat( br.readLine() );

		System.out.print("Enter Breadth of a Cuboid : ");
		breadthOfCuboid = Float.parseFloat( br.readLine() );

		System.out.print("Enter Height of a Cuboid : ");
		heightOfCuboid = Float.parseFloat( br.readLine() );

		if( lengthOfCuboid <= 0 || breadthOfCuboid <= 0 || heightOfCuboid <= 0 )
		{
			System.out.println("Invalid Inputs Check Again!!!");
		}
		else
		{
			/*Calculating Surface Area of Cuboid*/
			surfaceAreaOfCuboid = 2 * ( (lengthOfCuboid*breadthOfCuboid) + (lengthOfCuboid*heightOfCuboid) + (breadthOfCuboid*breadthOfCuboid) );
			System.out.println("Surface Area of Cuboid : " + surfaceAreaOfCuboid);
		}


		System.out.println();
	}
}