package com.example.calculator;

final public class Operand implements Token {
    final double value;

    public Operand(double value) {
        this.value = value;
    }

    public boolean isOperand(){
        return true;
    }

    public double getValue(){
        return this.value;
    }
}

