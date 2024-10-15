package com.tca;

import com.tca.entities.DivideByZeroException;
import com.tca.exceptions.InvalidAgeException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {









        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        double num1=0;
        double num2=0;
        double ans = 0;

        int []arr = {0,1,2,3,4,5,6,7,8,9};
        int index = 0;

        int num=0;

        String str = null;

        byte age=0;

/*
        //1. Divide by Zero Exception
        System.out.println("\nDivide By Zero Started Application......\n");

        num1 = getDoubleInput(br, "Enter First Number : ");
        num2 = getDoubleInput(br, "Enter Second Number : ");

        try{
            ans = DivideByZeroException.getDiv(num1, num2);
        }
        catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        catch (Exception e){
            System.out.println("Unknown Error : " + e.getMessage());
//            e.printStackTrace();
        }


        System.out.println("Answer : " + ans);

        System.out.println("\nDivide By Zero Ended Application......\n");
*/



/*
        // 2.Array Index Out of Bounds
        // Write a program that accepts an index from the user and prints the element at
        // that index from an array of size 10. Handle the scenario where the user
        // provides an index that is out of bounds and throw an ArrayIndexOutOfBoundsException.


        System.out.println("\nArray Index Out of Bounds Started Application......\n");

        System.out.println("Array : " + Arrays.toString(arr));
        index = getIntegerInput(br, "Enter Index : ");
        try{
            System.out.println("Element at Index " + index + " : " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("ArrayIndexOutOfBoundsException : " + aioobe.getMessage());
        }

        System.out.println("\nArray Index Out of Bounds Ended Application......\n");
*/


/*
        // 3.Input Mismatch Exception -. Scanner
        // Create a program that takes an integer input from the user. Handle the situation where the user
        // inputs a non-integer value and throw an InputMismatchException with a meaningful message like
        // "Please enter a valid integer."

        System.out.println("\nInput Mismatch Exception Started Application......\n");

        num = getIntegerInput(sc, "Enter Integer Number : ");

        System.out.println("Entered Number : " + num);

        System.out.println("\nInput Mismatch Exception Ended Application......\n");
*/



/*
        // 4. Null Pointer Exception
        // Write a program where you declare a string as null, and then try to access its length. Handle the
        // scenario where the string is null and throw a NullPointerException with a custom message like
        // "Cannot find length of a null string."

        System.out.println("\nNull Pointer Exception Started Application......\n");

        str = null;
        try{
            if(str == null) {
                throw new NullPointerException("Cannot find length of a null string");
            }
            System.out.println("Length of String : " + str.length());
        }
        catch (NullPointerException npe){
            //Default Msg -> Cannot invoke "String.length()" because "str" is null
            System.out.println(npe.getMessage());
        }
        catch (Exception e){
            System.out.println("Unknown Error! :" + e.getMessage());
//            e.printStackTrace();
        }

        System.out.println("\nNull Pointer Exception Ended Application......\n");
*/



/*
        // 5. Custom Exception for Invalid Age
        // Create a custom exception called InvalidAgeException. Write a program that accepts a user's
        // age, and if the age is less than 18, throw an InvalidAgeException with a message saying
        // "Age must be 18 or above."

        System.out.println("\nCustom Exception for Invalid Age Started Application......\n");

        try{
            age = getByteInput(br, "Enter Age : ");
            if(age < 18){
                throw new InvalidAgeException("Age must be 18 or above");
            }
            System.out.println("Access Granted :)");
        }
        catch (InvalidAgeException iae)
        {
            System.out.println( iae.getMessage() );
        }

        System.out.println("\nCustom Exception for Invalid Age Ended Application......\n");
*/


        /*

        num = getIntegerInput(br, "Enter Number : ");
        assert num >=0 : "Negative are not allowed";
        */

        //Closing Resources
        try{
            br.close();
            sc.close();
        }
        catch (IOException e) {
            System.out.println("IOException Occured While Closing BufferedReader br.close()!!!" + e.getMessage());
//            e.printStackTrace();
        }


        System.out.println("Byee.....");
    }








    public static double getDoubleInput(BufferedReader br, String msg){
        while(true){
            try{
                System.out.print(msg);
                return Double.parseDouble( br.readLine() );
            }
            catch (IOException ioe){
                System.out.println("IOException Occurred Reading Input! :" + ioe.getMessage());
            }
            catch (NumberFormatException nfe){
                System.out.println("NumberFormatException Enter A valid number! :" + nfe.getMessage());
            }
            catch (Exception e){
                System.out.println("Unknown Exception at :" + e.getMessage());
//                e.printStackTrace();
            }
        }
    }

    public static int getIntegerInput(BufferedReader br, String msg){
        while(true){
            try{
                System.out.print(msg);
                return Integer.parseInt( br.readLine() );
            }
            catch (IOException ioe) {
                System.out.println("IOException Occurred While Reading Input :" + ioe.getMessage());
            }
            catch (NumberFormatException nfe) {
                System.out.println("NumberFormatException Enter A Valid Number! :" + nfe.getMessage());
            }
            catch (Exception e) {
                System.out.println("Unknown Error :" + e.getMessage());
//                e.printStackTrace();
            }
        }
    }



    public static int getIntegerInput(Scanner sc, String msg){
        while(true){
            try {
                System.out.print(msg);
                return sc.nextInt();
            }
            catch (InputMismatchException ime){
                System.out.println("Please enter a valid integer! :" + ime.getMessage());
                sc.next();          //clear the invalid input
            }
            catch (IllegalStateException ise){
                System.out.println("Scanner is closed! Cannot use it." + ise.getMessage());
                break;
            }
            catch (Exception e){
                System.out.println("Unknown Error :" + e.getMessage());
                sc.next();          //clear the invalid input
//                e.printStackTrace();
            }
        }
        return 0;
    }

    public static Byte getByteInput(BufferedReader br, String msg){
        while(true){
            try{
                System.out.print(msg);
                return Byte.parseByte( br.readLine() );
            }
            catch (IOException ioe) {
                System.out.println("IOException Occurred While Reading Input :" + ioe.getMessage());
            }
            catch (NumberFormatException nfe) {
                System.out.println("NumberFormatException Enter A Valid Number! :" + nfe.getMessage());
            }
            catch (Exception e) {
                System.out.println("Unknown Error :" + e.getMessage());
//                e.printStackTrace();
            }
        }
    }


}