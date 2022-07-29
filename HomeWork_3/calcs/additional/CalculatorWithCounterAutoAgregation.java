package HomeWork_3.calcs.additional;
import HomeWork_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    CalculatorWithMathCopy calc;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc) {
        this.calc = calc;
    }

    private long counter;

    public long getCountOperation() {
        return counter;
    }

    public double sum(double x, double y) {
        counter++;
        return calc.sum(x, y);
    }

    public double subtraction(double x, double y) {
        counter++;
        return calc.subtraction(x, y);
    }

    public double mult(double x, double y) {
        counter++;
        return calc.mult(x, y);
    }

    public double div(double x, double y) {
        counter++;
        return calc.div(x, y);
    }

    public double deg(double x, int y) {
        counter++;
        return calc.deg(x, y);
    }

    public double mod(double x) {
        counter++;
        return calc.mod(x);
    }

    public double sqNumb(double x) {
        counter++;
        return calc.sqNumb(x);
    }

}
