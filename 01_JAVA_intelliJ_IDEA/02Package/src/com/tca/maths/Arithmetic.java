package com.tca.maths;

public class Arithmetic {
    public double firstNumber = 0;
    public double secondNumber = 0;

    public Arithmetic(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double add(){
        return this.firstNumber + this.secondNumber;
    }

    public double sub(){
        return this.firstNumber - this.secondNumber;
    }

    public double mul(){
        return this.firstNumber * this.secondNumber;
    }

    public double div(){
        return this.firstNumber / this.secondNumber;
    }
}
