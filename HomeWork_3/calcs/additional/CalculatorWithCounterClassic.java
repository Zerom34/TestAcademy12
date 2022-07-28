package HomeWork_3.calcs.additional;
import HomeWork_3.calcs.simple.CalculatorWithMathExtends;
public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long count = 0;

    public void incrementCountOperation() {
        count++;
    }


    public long getCountOperation() {
        return count;
    }
}