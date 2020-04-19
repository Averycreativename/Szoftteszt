package pti.gyak;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testResultAdd() {
        assertEquals(6.0, (new Calculator()).enter(5).enter(Operation.ADD).enter(1).getResult());
    }
    @Test
    public void testResultSubstract() {
        assertEquals(4.0, (new Calculator()).enter(5).enter(Operation.SUBSTRACT).enter(1).getResult());
    }
    @Test
    public void testResultMultiply() {
        assertEquals(10.0, (new Calculator()).enter(5).enter(Operation.MULTIPLY).enter(2).getResult());
    }
    @Test
    public void testResultDivideMoreThan0() {
        assertEquals(2.5, (new Calculator()).enter(5).enter(Operation.DIVIDE).enter(2).getResult());
    }
    @Test
    public void testResultRemainder() {
        assertEquals(1.0, (new Calculator()).enter(3).enter(Operation.REMAINDER).enter(2).getResult());
    }
    @Test
    public void testResultPower() {
        assertEquals(9.0, (new Calculator()).enter(3).enter(Operation.POWER).enter(2).getResult());
    }
    @Test
    public void testResultSqrt() {
        assertEquals(3.0, (new Calculator()).enter(9).enter(Operation.SQRT).getResult());
    }
    @Test
    public void testResultClear() {
        assertEquals(0, (new Calculator()).enter(9).enter(Operation.CLEAR).getResult());
    }
    @Test
    public void testResultNoOperationNoNumber() {
        assertEquals(0, (new Calculator()).getResult());
    }
    @Test
    public void testResultDivideInfP() {
        assertEquals(Double.POSITIVE_INFINITY, (new Calculator()).enter(5).enter(Operation.DIVIDE).enter(0).getResult());
    }
    @Test
    public void testResultDivideInfN() {
        assertEquals(Double.NEGATIVE_INFINITY, (new Calculator()).enter(-5).enter(Operation.DIVIDE).enter(0).getResult());
    }


    @Test
    public void testHistory() {
        assertEquals("5 + 1 = 6", (new Calculator()).enter(5).enter(Operation.ADD).enter(1).getHistory());
    }

}