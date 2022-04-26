package com.example.calculator;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class PostfixEvaluator {
    private ArrayList<Token> expression = new ArrayList<>();

    public void addToken(Token t)
    {
        expression.add(t);
    }
    public double evaluate(){
        ArrayDeque<Operand> operands = new ArrayDeque<>();

        for (Token t : expression){
            if (t.isOperand()) {
                operands.push((Operand) t);
            }
            else {
                if ( operands.size() < 2){
                    throw new ArithmeticException("You have less then two operands entered before the operator");
                }
                Operand op1 = operands.pop();
                Operand op2 = operands.pop();

                Operand result = ((Operator) t).evaluate(op1, op2);

                operands.push(result);
            }

        }
        if (operands.size() > 1){
            throw new ArithmeticException("There were too many Operands and not enough operator in the formula");
        }
        else if(operands.isEmpty()){
            throw new ArithmeticException("You can not evaluate an empty expression");
        }

        return operands.pop().getValue();
    }
}
