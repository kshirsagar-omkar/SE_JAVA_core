import java.io.*;
import java.util.*;


public class StudentManagementSystem
{
	public static int rno = 111;
	public static void main(String args[]) throws Exception
	{
	System.out.println("\n");

		BufferedReader br = new BufferedReader( new InputStreamReader (System.in) );

		StringBuffer students[]  = {
		    new StringBuffer( "101,Rohan,85.5,Mumbai" ),
		    new StringBuffer( "102,Omkar,90.2,Pune" ),
		    new StringBuffer( "103,Vaibhav,78.9,Pune" ),
		    new StringBuffer( "104,Rahul,82.3,Thane" ),
		    new StringBuffer( "105,Rushi,88.4,Nashik" ),
		    new StringBuffer( "106,Swapnil,91.0,Kolhapur" ),
		    new StringBuffer( "107,Akshay,79.5,Aurangabad" ),
		    new StringBuffer( "108,Ajinkya,87.7,Solapur" ),
		    new StringBuffer( "109,Shubham,83.2,Sangli" ),
		    new StringBuffer( "110,Mihir,89.6,Satara" )
		};
		

		while(true)
		{
			String option = "";


			System.out.println("\t\tWelcome To MyAcadamy\n");
			System.out.println("1.Print Students Detials");
			System.out.println("2.Add Student Detials");
			System.out.println("3.Delete Student Detials");
			System.out.println("4.Update Student Detials");
			System.out.print("\nEnter The Above Option : ");
			option = br.readLine();


			System.out.println("\n");
			switch(option)
			{
				case "1":
						displayStudentsRecords(students);
						break;
				case "2":
							
						students = addStudentToStudents(students);
						break;
				case "3":
						students = deleteStudentFromStudents(students);
						break;
				case "4":
						students = updateStudentFromStudents(students);
						break;
				default :
							System.out.println("Invalid Option");
			}
			
			if(chooseChoice().equals("continue"))
			{
				continue;
			}
			else 
			{
				break;
			}
		}

	System.out.println("\n");
	}


	public static String chooseChoice()
	{
		Scanner sc = new Scanner( System.in );
		String choice = "";
		System.out.print("Want To Continue (Yes/No) : ");
		choice = ( sc.next() );
		if(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"))
		{
			System.out.println("\n");
			return "continue";
		}
		else if(choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n"))
		{
			System.out.println("\nThanks For Using Our Service :)");
			return "break";
		}

		System.out.println("\nInvalid Choice!! \nTry Again");
		return "continue";
	}




	public static void displayStudentsRecords(StringBuffer []students) 
	{
		System.out.println("Stundet Detials\n");
		System.out.println("rno\tname\t\tper\tcity\n---------------------------------------");

		for(int i=0; i<students.length; ++i)
		{
			String student[] = ( students[i].toString() ).split(",");
			System.out.println(student[0] + "\t" + student[1] + "\t\t" + student[2] + "\t" + student[3]);
		}
		System.out.println("\n");
	}

	public static StringBuffer[] addStudentToStudents(StringBuffer []students)
	{
		StringBuffer []updatedStudentRecords = new StringBuffer[students.length+1];
		StringBuffer newStudent = new StringBuffer("");
		Scanner sc = new Scanner( System.in );


		newStudent.append( Integer.toString(rno) );
		rno++;
		newStudent.append( "," );

		System.out.print("Enter Name : ");
		newStudent.append( sc.next() );
		newStudent.append( "," );

		System.out.print("Enter Per : ");
		newStudent.append( sc.next() );
		newStudent.append( "," );

		System.out.print("Enter City : ");
		newStudent.append( sc.next() );


		for(int i=0; i<students.length; ++i)
		{
			updatedStudentRecords[i] = students[i];
		}

		updatedStudentRecords[students.length] = newStudent;
		System.out.println("\n");

		return updatedStudentRecords;
	}


	public static StringBuffer[] deleteStudentFromStudents(StringBuffer []students)
	{
		Scanner sc = new Scanner( System.in );
		
		String studentRno;
		System.out.print("Enter Student Rno : ");
		studentRno = sc.next();

		StringBuffer []updatedStudentRecords = new StringBuffer[students.length-1];
		int k=0;
		for(int i=0; i<students.length; ++i)
		{
			if( !(students[i].toString().startsWith(studentRno)) )
			{
				updatedStudentRecords[k++] = students[i];
			}
		}
		System.out.println("\n");

		return updatedStudentRecords;
	}

	public static StringBuffer[] updateStudentFromStudents(StringBuffer []students)
	{
		Scanner sc = new Scanner( System.in );
		String studentRno;

		System.out.print("Enter Student Rno : ");
		studentRno = sc.next();

		boolean isStudentFound = false;
		for(int i=0; i<students.length; ++i)
		{
			if( (students[i].toString().startsWith(studentRno)) )
			{
				isStudentFound = true;

				StringBuffer updatededStudent = new StringBuffer("");
		
				updatededStudent.append( studentRno );
				updatededStudent.append( "," );

				System.out.print("Enter Name : ");
				updatededStudent.append( sc.next() );
				updatededStudent.append( "," );

				System.out.print("Enter Per : ");
				updatededStudent.append( sc.next() );
				updatededStudent.append( "," );

				System.out.print("Enter City : ");
				updatededStudent.append( sc.next() );

				students[i] = updatededStudent;
				System.out.println(studentRno + " Record Updated SuccesFully !!");
			}
		}

		if(isStudentFound == false)
		{
			System.out.println("No Record Found For " + studentRno);
		}

		System.out.println("\n");
		return students;
	}


}