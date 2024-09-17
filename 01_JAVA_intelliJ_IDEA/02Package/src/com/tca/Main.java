package com.tca;

import com.tca.maths.Arithmetic;

public class Main {
    public static void main(String[] args) {

        double firstNumber = 3;
        double secondNumber = 5;

        System.out.println("\nArithmetic Package!");

        Arithmetic ob1 = new Arithmetic(firstNumber, secondNumber);

        System.out.println("Addition : " + ob1.add());

    }
}