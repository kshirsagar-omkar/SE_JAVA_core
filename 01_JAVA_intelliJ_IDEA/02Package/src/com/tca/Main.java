package com.tca;

import com.tca.maths.Arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        String choice = null;

        System.out.println("\nArithmetic Package!\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Arithmetic ob1 = new Arithmetic();

        while(true){
            System.out.print("Enter First Number : ");
            double firstNumber = Double.parseDouble(br.readLine());

            System.out.print("Enter Second Number : ");
            double secondNumber = Double.parseDouble(br.readLine());

            System.out.print("Enter Operation (+,-,/,*)/exit : ");
            choice = br.readLine();


            ob1.setFirstNumber(firstNumber);
            ob1.setSecondNumber(secondNumber);

            switch (choice) {
                case "+":
                    System.out.println("Addition : " + ob1.add());
                    break;
                case "-":
                    System.out.println("Substraction : " + ob1.sub());
                    break;
                case "/":
                    System.out.println("Division : " + ob1.div());
                    break;
                case "*":
                    System.out.println("Multiplication : " + ob1.mul());
                    break;
                case "exit":
                    System.out.println("Shutting Down System\n");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!!!\n");

            }
        }
    }


}