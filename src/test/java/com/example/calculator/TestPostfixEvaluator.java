package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPostfixEvaluator {
    @Test
    public void PostfixEvaluator_CorrectExpression_EvaluateToANumber(){
        PostfixEvaluator evaluator = new PostfixEvaluator();
        evaluator.addToken(new Operand(3));
        evaluator.addToken(new Operand(2));
        evaluator.addToken(new Multiplication());
        evaluator.addToken(new Operand(5));
        evaluator.addToken(new Addition());
        evaluator.addToken(new Operand(6));
        evaluator.addToken(new Operand(4));
        evaluator.addToken(new Multiplication());
        evaluator.addToken(new Addition());

        assertEquals(35,evaluator.evaluate());
    }
    @Test
    public void PostfixEvaluator_ExpressionWithOneOperandOnlyAndOneOperator_ThrowsArithmeticException()
    {
        Exception exception = assertThrows(ArithmeticException.class, ()->{
            PostfixEvaluator evaluator = new PostfixEvaluator();
            evaluator.addToken(new Operand(3));
            evaluator.addToken(new Multiplication());
            evaluator.evaluate();
        });
        String expectedMessage = "You have less then two operands entered before the operator";
        String actualMessage = exception.getMessage();
        //asserting the exception message if it contains
        //our expected message
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void PostfixEvaluator_EmptyExpression_ThrowsArithmeticException(){
        PostfixEvaluator evaluator = new PostfixEvaluator();

        Exception exception = assertThrows(ArithmeticException.class, ()->{
            evaluator.evaluate();
        });

        String expectedMessage = "You can not evaluate an empty expression";
        String actualMessage = exception.getMessage();
        //asserting the exception message if it contains
        //our expected message
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void PostfixEvaluator_ExpressionWithToManyOperands_ThrowsArithmeticException(){
        PostfixEvaluator evaluator = new PostfixEvaluator();
        evaluator.addToken(new Operand(2));
        evaluator.addToken(new Operand(3));
        evaluator.addToken(new Operand(5));

        Exception exception = assertThrows(ArithmeticException.class, ()->{
            evaluator.evaluate();
        });

        String expectedMessage = "There were too many Operands and not enough operator in the formula";
        String actualMessage = exception.getMessage();
        //asserting the exception message if it contains
        //our expected message
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void PostfixEvaluator_CorrectExpression_EvaluateToANegativeResult(){
        PostfixEvaluator evaluator = new PostfixEvaluator();
        evaluator.addToken(new Operand(3));
        evaluator.addToken(new Operand(-2));
        evaluator.addToken(new Multiplication());
        evaluator.addToken(new Operand(-1));
        evaluator.addToken(new Addition());
        evaluator.addToken(new Operand(-7));
        evaluator.addToken(new Operand(4));
        evaluator.addToken(new Multiplication());
        evaluator.addToken(new Addition());

        assertEquals(-35,evaluator.evaluate());
    }
}
