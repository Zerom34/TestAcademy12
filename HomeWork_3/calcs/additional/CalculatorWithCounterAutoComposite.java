package HomeWork_3.calcs.additional;

public class CalculatorWithCounterAutoComposite {
    private final CalculatorWithCounterAutoSuper calculator;
    private long count;

    public void incrementCountOperation() {
        count++;
    }


    public long getCountOperation() {
        return count;
    }

    public CalculatorWithCounterAutoComposite() {
        this.calculator = new CalculatorWithCounterAutoSuper();
    }

    public double sum(double num1, double mum1) {
        incrementCountOperation();
        return calculator.sum(num1, mum1);
    }

    public double subtraction(double num2, double mum2) {
        incrementCountOperation();
        return calculator.subtraction(num2, mum2);
    }

    public double mult(double num3, double mum3) {
        incrementCountOperation();
        return calculator.mult(num3, mum3);
    }

    public double div(double num4, double mum4) {
        incrementCountOperation();
        return calculator.div(num4, mum4);
    }

    public double deg(double num5, int mum5) {
        incrementCountOperation();
        return calculator.deg(num5, mum5);
    }

    public double mod(double num6) {
        incrementCountOperation();
        return calculator.mod(num6);
    }

    public double sqNumb(double num7) {
        incrementCountOperation();
        return calculator.sqNumb(num7);
    }
}