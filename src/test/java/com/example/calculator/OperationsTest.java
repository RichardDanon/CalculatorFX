package com.example.calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsTest {
    @Test
    public void AdditionEvaluate_TwoPositiveOperands_AddTheNumbers(){
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(3);
        Addition addition = new Addition();
        Operand result = addition.evaluate(op1, op2);

        assertEquals(5 , result.getValue());
    }
    @Test
    public void AdditionEvaluate_FivePlusFive_AddTheNumbers(){
        Operand op1 = new Operand(5);
        Operand op2 = new Operand(5);
        Addition addition = new Addition();
        Operand result = addition.evaluate(op1, op2);

        assertEquals(10 , result.getValue());
    }
    @Test
    public void AdditionEvaluate_ThreePlusNegativeFive_AddTheNumbers(){
        Operand op1 = new Operand(3);
        Operand op2 = new Operand(-5);
        Addition addition = new Addition();
        Operand result = addition.evaluate(op1, op2);

        assertEquals(-2 , result.getValue());
    }
    @Test
    public void SubtractionEvaluate_ThreeMinusNegativeFive_SubtractTheNumbers(){
        Operand op1 = new Operand(3);
        Operand op2 = new Operand(-5);
        Subtraction operation = new Subtraction();
        Operand result = operation.evaluate(op1, op2);

        assertEquals(8 , result.getValue());
    }
    @Test
    public void SubtractionEvaluate_FiveMinusTwo_SubtractTheNumbers(){
        Operand op1 = new Operand(5);
        Operand op2 = new Operand(2);
        Subtraction operation = new Subtraction();
        Operand result = operation.evaluate(op1, op2);

        assertEquals(3 , result.getValue());
    }
    @Test
    public void SubtractionEvaluate_SixMinusSix_SubtractTheNumbers(){
        Operand op1 = new Operand(6);
        Operand op2 = new Operand(6);
        Subtraction operation = new Subtraction();
        Operand result = operation.evaluate(op1, op2);

        assertEquals(0 , result.getValue());
    }
    @Test
    public void MultiplicationEvaluate_TwoTimeThree_MultiplyTheNumbers(){
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(3);
        Multiplication operation = new Multiplication();
        Operand result = operation.evaluate(op1, op2);

        assertEquals(6 , result.getValue());
    }
    @Test
    public void MultiplicationEvaluate_TwoTimeNegativeThree_MultiplyTheNumbers(){
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(-4);
        Multiplication operation = new Multiplication();
        Operand result = operation.evaluate(op1, op2);

        assertEquals(-8 , result.getValue());
    }
    @Test
    public void MultiplicationEvaluate_NegativeTwoTimeNegativeThree_MultiplyTheNumbers(){
        Operand op1 = new Operand(-2);
        Operand op2 = new Operand(-3);
        Multiplication operation = new Multiplication();
        Operand result = operation.evaluate(op1, op2);

        assertEquals(6 , result.getValue());
    }
    @Test
    public void DivisionEvaluate_NineDividedByThree_DivideTheNumbers(){
        Operand op1 = new Operand(9);
        Operand op2 = new Operand(3);
        Division operation = new Division();
        Operand result = operation.evaluate(op1, op2);

        assertEquals(3 , result.getValue());
    }
    @Test
    public void DivisionEvaluate_NineDividedByFour_DivideTheNumbers(){
        Operand op1 = new Operand(9);
        Operand op2 = new Operand(4);
        Division operation = new Division();
        Operand result = operation.evaluate(op1, op2);

        assertEquals(2.25 , result.getValue());
    }
    @Test
    public void DivisionEvaluate_NineDividedByNegativeThree_DivideTheNumbers(){
        Operand op1 = new Operand(9);
        Operand op2 = new Operand(-3);
        Division operation = new Division();
        Operand result = operation.evaluate(op1, op2);

        assertEquals(-3 , result.getValue());
    }


}
