package HomeWork_3.runners;
import HomeWork_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import HomeWork_3.calcs.simple.CalculatorWithMathCopy;
import HomeWork_3.calcs.simple.CalculatorWithMathExtends;
import HomeWork_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithOperator cwo = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation cwcaca = new CalculatorWithCounterAutoChoiceAgregation(cwo);
        double resSum = cwcaca.mult(15.0, 7.0);
        double resDiv = cwcaca.div(28.0, 5.0);
        double resDeg = cwcaca.deg(resDiv, 2);
        double resFinalSum = cwcaca.sum(resSum, resDeg);
        double result = cwcaca.sum(4.1, resFinalSum);
        System.out.println(result);
        System.out.println("Калькулятор был использован " + cwcaca.getCountOperation() + " раз");

        CalculatorWithMathCopy cwmc = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation cwcaca2 = new CalculatorWithCounterAutoChoiceAgregation(cwmc);
        double resSum2 = cwcaca2.mult(15.0, 7.0);
        double resDiv2 = cwcaca2.div(28.0, 5.0);
        double resDeg2 = cwcaca2.deg(resDiv2, 2);
        double resFinalSum2 = cwcaca2.sum(resSum2, resDeg2);
        double result2 = cwcaca2.sum(4.1, resFinalSum2);
        System.out.println(result2);
        System.out.println("Калькулятор был использован " + cwcaca.getCountOperation() + " раз");


        CalculatorWithMathExtends cwme = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation cwcaca3 = new CalculatorWithCounterAutoChoiceAgregation(cwme);
        double resSum3 = cwcaca3.mult(15.0, 7.0);
        double resDiv3 = cwcaca3.div(28.0, 5.0);
        double resDeg3 = cwcaca3.deg(resDiv3, 2);
        double resFinalSum3 = cwcaca3.sum(resSum3, resDeg3);
        double result3 = cwcaca3.sum(4.1, resFinalSum3);
        System.out.println(result3);
        System.out.println("Калькулятор был использован " + cwcaca.getCountOperation() + " раз");
    }
}
