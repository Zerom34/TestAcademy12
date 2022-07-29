package HomeWork_3.runners;
import HomeWork_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import HomeWork_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {

    public static void main(String[] args) {

        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calcWCAC = new CalculatorWithCounterAutoAgregation(calc);
        double resSum = calcWCAC.mult(15.0, 7.0);
        double resDiv = calcWCAC.div(28.0, 5.0);
        double resDeg = calcWCAC.deg(resDiv, 2);
        double resFinalSum = calcWCAC.sum(resSum, resDeg);
        double result = calcWCAC.sum(4.1, resFinalSum);
        System.out.println(result);
        System.out.println("Калькулятор был использован " + calcWCAC.getCountOperation() + " раз");
    }
}