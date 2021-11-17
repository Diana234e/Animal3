import org.junit.Test;


import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        int a = 10;
        int b = 15;
        assertEquals(25, Calculator.add(a, b), 0.0);
    }
    @Test
    public void subtract() {
        int a = 25; int b = 20;
        int expectedResult = 5;
        double result = Calculator.subtract(a, b);
        assertEquals(expectedResult, result, 0.0);
    }
    @Test
    public void multiply() {
        int a = 10; int b = 25;
        long expectedResult = 250;
        double result = Calculator.multiply(a, b);
        assertEquals(expectedResult, result, 0.0);
    }
    @Test
    public void division() {
        int a = 56; int b = 10;
        double expectedResult = 5.6;
        double result = Calculator.division(a, b);
        assertEquals(expectedResult, result,0.00005);
    }
    @Test
    public void testMultiplyByZero() throws Exception {
        Calculator.multiply(10,0);
        assertEquals(Calculator.currentTotal, 0.0, 0.0);
    }

    @Test
    public void testDivideByZero() throws Exception {
        Calculator.division(10,0);
        assertEquals(Calculator.currentTotal, 0.0, 0.0);
    }
}