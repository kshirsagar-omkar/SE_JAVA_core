import java.io.*;
import java.util.*;



class Student
{
	private int studentPRNnumber;
	private String studentName;
	private float studentPer;

	public Student()
	{
		this.studentPRNnumber = 0;
		this.studentName = "NA";
		this.studentPer = 0;
	}
	public Student(final int studentPRNnumber, final String studentName, final float studentPer)
	{
		this.studentPRNnumber = studentPRNnumber;
		this.studentName = studentName;
		this.studentPer = studentPer;
	}

	public final void setStudentPRNnumber(int studentPRNnumber)
	{
		this.studentPRNnumber = studentPRNnumber;
	}
	public final void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	public final void setStudentPer(float studentPer)
	{
		this.studentPer = studentPer;
	}

	
	public final int getStudentPRNnumber()
	{
		return this.studentPRNnumber;
	}
	public final String getStudentName()
	{
		return this.studentName;
	}
	public final float getStudentPer()
	{
		return this.studentPer;
	}
	

	public final void display()
	{
			System.out.println(studentPRNnumber + " | " + studentName + " | " + studentPer);
	}

}








public class StudentClass
{
	public static void main(String []args) throws Exception
	{

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n=0; 			//Store How Many Studenet 

		System.out.print("Enter How Many Student : ");
		n = Integer.parseInt( br.readLine() );

		System.out.println();


		Student s[] = new Student[n];
		
		for(int i=0; i<s.length; ++i)
		{
			s[i] = new Student();
			
			System.out.print("Enter Rno : ");
			s[i].setStudentPRNnumber( Integer.parseInt( br.readLine() ) );

			System.out.print("Enter Name : ");
			s[i].setStudentName( br.readLine() );

			System.out.print("Enter Per : ");
			s[i].setStudentPer( Float.parseFloat( br.readLine() ) );

			System.out.println();
		}

		for(int i=0; i<s.length; ++i)
		{
			s[i].display();
		}

	}
}