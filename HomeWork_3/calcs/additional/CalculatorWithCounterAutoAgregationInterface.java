package HomeWork_3.calcs.additional;
import HomeWork_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    private long count;
    private final ICalculator calculator;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    @Override
    public double sum(double num1, double mum1) {
        incrementCountOperation();
        return calculator.sum(num1, mum1);
    }

    @Override
    public double subtraction(double num2, double mum2) {
        incrementCountOperation();
        return calculator.subtraction(num2, mum2);
    }

    @Override
    public double mult(double num3, double mum3) {
        incrementCountOperation();
        return calculator.mult(num3, mum3);
    }

    @Override
    public double div(double num4, double mum4) {
        incrementCountOperation();
        return calculator.div(num4, mum4);
    }

    @Override
    public double deg(double num5, double mum5) {
        incrementCountOperation();
        return calculator.deg(num5, mum5);
    }

    @Override
    public double mod(double num6) {
        incrementCountOperation();
        return calculator.mod(num6);
    }

    @Override
    public double sqNumb(double num7) {
        incrementCountOperation();
        return calculator.sqNumb(num7);
    }
}