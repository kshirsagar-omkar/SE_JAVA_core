package com.tca.maths;

public class Arithmetic {
    private double firstNumber = 0;
    private double secondNumber = 0;

    public Arithmetic() {
        this.firstNumber = 0;
        this.secondNumber = 0;
    }

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

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
