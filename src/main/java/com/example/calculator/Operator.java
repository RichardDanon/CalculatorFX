package com.example.calculator;

abstract public class Operator implements Token{
    @Override
    public boolean isOperand() {
        return false;
    }
    abstract public Operand evaluate( Operand op1, Operand op2);
}
