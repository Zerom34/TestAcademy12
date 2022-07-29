package HomeWork_3.calcs.additional;
import HomeWork_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    private final CalculatorWithMathCopy calc;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc) {
        this.calc = calc;
    }

    private long count;

    public void incrementCountOperation() {
        count++;
    }


    public long getCountOperation() {
        return count;
    }

    public double sum(double num1, double mum1) {
        incrementCountOperation();
        return calc.sum(num1, mum1);
    }

    public double subtraction(double num2, double mum2) {
        incrementCountOperation();
        return calc.subtraction(num2, mum2);
    }

    public double mult(double num3, double mum3) {
        incrementCountOperation();
        return calc.mult(num3, mum3);
    }

    public double div(double num4, double mum4) {
        incrementCountOperation();
        return calc.div(num4, mum4);
    }

    public double deg(double num5, int mum5) {
        incrementCountOperation();
        return calc.deg(num5, mum5);
    }

    public double mod(double num6) {
        incrementCountOperation();
        return calc.mod(num6);
    }

    public double sqNumb(double num7) {
        incrementCountOperation();
        return calc.sqNumb(num7);
    }

}
