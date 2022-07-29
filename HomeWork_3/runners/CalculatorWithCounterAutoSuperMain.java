package HomeWork_3.runners;

import HomeWork_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args){
        CalculatorWithCounterAutoSuper calcWCAS = new CalculatorWithCounterAutoSuper();
        double resSum = calcWCAS.mult(15.0, 7.0);
        calcWCAS.incrementCountOperation();
        double resDiv = calcWCAS.div(28.0, 5.0);
        calcWCAS.incrementCountOperation();
        double resDeg = calcWCAS.deg(resDiv, 2.0);
        calcWCAS.incrementCountOperation();
        double resFinalSum = calcWCAS.sum(resSum, resDeg);
        calcWCAS.incrementCountOperation();
        double result = calcWCAS.sum(4.1, resFinalSum);
        System.out.println(result);
        System.out.println("Калькулятор был использован " + calcWCAS.getCountOperation() + " раз");
    }
}