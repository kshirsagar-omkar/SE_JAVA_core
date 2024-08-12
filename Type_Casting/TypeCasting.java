import java.io.*;

public class TypeCasting
{
	public static void main(String []args)
	{
		System.out.println("\n");

		float PI = 3.14f;
		System.out.println("Value of PI : " + PI);


		// int intPI = PI;			Error
		int intPI = (int) PI;
		System.out.println("Value of intPI : " + intPI);



		System.out.println("\n");

		/*AutoBoxing*/
		Integer intObj = 11;
		System.out.println("Value of intObj : " + intObj);


		/*UnBoxing*/
		int i = intObj;
		System.out.println("Value of i : " + i);

		System.out.println("\n");
	}
}




/*

	float f = 3.14;				//Error Data Loose
	->
		float f = 3.14f;

	Type Casting

		double --> int 			//Error 	Data Loose
		double --> float		//Error 	Data Loose

	There Are Two Types of Type Casting

	1) Automatically Done by Compiler/Interpriter is called as implicit Type Casting
	->
		int --> float 				//No Data Loose

	2) Done by Devloper is called as Explicit Type Casting
	->
		int <-- int(3.14)
	


	*AutoBoxing
	->
		When int is assigned to object
		Intiger obj = 11;				// Data Types --> Class Types
	
	
	*Unboxing
	->
		When Object is Assigned to Data Type

		Intiger obj(11);
		int i = obj;

		obj madhla thoda part ghenar ani to int i madhe thevnar

		Class Types --> Data Types

*/