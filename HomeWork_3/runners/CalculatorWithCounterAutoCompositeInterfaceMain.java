package HomeWork_3.runners;
import HomeWork_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import HomeWork_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calsWCAAI=new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        double resSum = calsWCAAI.mult(15.0, 7.0);
        double resDiv = calsWCAAI.div(28.0, 5.0);
        double resDeg = calsWCAAI.deg(resDiv, 2);
        double resFinalSum = calsWCAAI.sum(resSum, resDeg);
        double result = calsWCAAI.sum(4.1, resFinalSum);
        System.out.println(result);
        System.out.println("Калькулятор был использован " + calsWCAAI.getCountOperation() + " раз");
    }
}