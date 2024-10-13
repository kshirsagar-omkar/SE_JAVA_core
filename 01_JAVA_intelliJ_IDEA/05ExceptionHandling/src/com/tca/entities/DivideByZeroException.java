package com.tca.entities;

/*
*    1. Divide by Zero Exception
*    Write a program that takes two numbers as input and divides the first number by the second.
*    Handle the situation where the second number is zero and throw an ArithmeticException with a custom message like
*    "Division by zero is not allowed."
*/


public class DivideByZeroException {

    public static double getDiv(double num1, double num2) throws ArithmeticException {

        if(num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        return num1 / num2;
    }
}
