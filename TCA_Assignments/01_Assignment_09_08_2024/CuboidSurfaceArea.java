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
		float length_of_cuboid = 0;
		float breadth_of_cuboid = 0;
		float height_of_cuboid = 0;
		float surface_area_of_cuboid = 0;

		/*Accepting Values For Further Calculations*/
		System.out.print("Enter Length of a Cuboid : ");
		length_of_cuboid = Float.parseFloat( br.readLine() );

		System.out.print("Enter Breadth of a Cuboid : ");
		breadth_of_cuboid = Float.parseFloat( br.readLine() );

		System.out.print("Enter Height of a Cuboid : ");
		height_of_cuboid = Float.parseFloat( br.readLine() );

		if( length_of_cuboid <= 0 || breadth_of_cuboid <= 0 || height_of_cuboid <= 0 )
		{
			System.out.println("Invalid Inputs Check Again!!!");
		}
		else
		{
			/*Calculating Surface Area of Cuboid*/
			surface_area_of_cuboid = 2 * ( (length_of_cuboid*breadth_of_cuboid) + (length_of_cuboid*height_of_cuboid) + (breadth_of_cuboid*height_of_cuboid) );
			System.out.println("Surface Area of Cuboid : " + surface_area_of_cuboid);
		}


		System.out.println();
	}
}