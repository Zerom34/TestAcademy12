package Test.HomeWork_3.calcs.simple;

import HomeWork_3.calcs.api.ICalculator;
import HomeWork_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithMathExtendsTest {
    @Test
    public void sum() {
        ICalculator calc = new CalculatorWithMathExtends();
        assertEquals(100, calc.sum(55, 45));
    }

    @Test
    public void subtraction() {
        ICalculator calc = new CalculatorWithMathExtends();
        assertEquals(10, calc.subtraction(55, 45));
    }

    @Test
    public void mult() {
        ICalculator calc = new CalculatorWithMathExtends();
        assertEquals(55, calc.mult(5, 11));
    }

    @Test
    public void div() {
        ICalculator calc = new CalculatorWithMathExtends();
        assertEquals(61.25, calc.div(245, 4));
    }

    @Test
    public void deg() {
        ICalculator calc = new CalculatorWithMathExtends();
        assertEquals(125, calc.deg(5, 3));
    }

    @Test
    public void mod() {
        ICalculator calc = new CalculatorWithMathExtends();
        assertEquals(22, calc.mod(-22));
    }

    @Test
    public void sqNumb() {
        ICalculator calc = new CalculatorWithMathExtends();
        assertEquals(5, calc.sqNumb(25));
    }

}