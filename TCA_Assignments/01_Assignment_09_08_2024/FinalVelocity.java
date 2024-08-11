/*
	Author : Omkar Kshirsagar
	Language : JAVA
	Date : 11/08/2024

	Problem Statement : Write a JAVA program to accept initial velocity (u), acceleration (a), and 
	time (t). Print the final velocity (v).

	->
		v = u + a * t

*/

import java.io.*;

public class FinalVelocity
{
	public static void main(String []args) throws Exception
	{
		System.out.println();


		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ); 

		/*Variables For Calculations*/
		float initial_velocity = 0;
		float acceleration = 0;
		float time = 0;
		float final_velocity = 0;


		/*Accepting Values*/
		System.out.print("Enter Initial Velocity(m/s) : ");
		initial_velocity = Float.parseFloat( br.readLine() );

		System.out.print("Enter Acceleration(m/s^2)   : ");
		acceleration = Float.parseFloat( br.readLine() );

		System.out.print("Enter Time(s)               : ");
		time = Float.parseFloat( br.readLine() );


		/*Calculating Final velocity*/
		final_velocity = initial_velocity + ( acceleration * time );


		/*FinalVelocity.java:44: error: non-static method calculatFinalVelocity(float,float,float) cannot be referenced from a static context
          final_velocity = calculatFinalVelocity(initial_velocity, acceleration, time);*/


		/*Printing Final Velocity*/
		System.out.print("\nFinal Velocity : " + final_velocity + " m/s");

		System.out.println();
	}


	/*static float calculatFinalVelocity(float initial_velocity, float acceleration, float time)
	{
		return initial_velocity + ( acceleration * time );
	}*/
}