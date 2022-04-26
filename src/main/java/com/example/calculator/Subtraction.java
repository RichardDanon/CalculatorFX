package com.example.calculator;

public class Subtraction extends Operator{

    @Override
    public Operand evaluate(Operand op1, Operand op2) {
        double result = op1.getValue() - op2.getValue();
        return new Operand(result);
    }
}
