package Test.HomeWork_3.calcs.additional;
import HomeWork_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import HomeWork_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithCounterAutoAgregationInterfaceTest {
    private final CalculatorWithCounterAutoAgregationInterface calc = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
    @Test
    public void sum() {
        assertEquals(100, calc.sum(55, 45));
    }

    @Test
    public void subtraction() {
        assertEquals(10, calc.subtraction(55, 45));
    }

    @Test
    public void mult() {
        assertEquals(55, calc.mult(5, 11));
    }

    @Test
    public void div() {
        assertEquals(61.25, calc.div(245, 4));
    }

    @Test
    public void deg() {;
        assertEquals(125, calc.deg(5, 3));
    }

    @Test
    public void mod() {
        assertEquals(22, calc.mod(-22));
    }

    @Test
    public void sqNumb() {
        assertEquals(5, calc.sqNumb(25));
    }
}
