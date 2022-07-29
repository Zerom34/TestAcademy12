package HomeWork_3.runners;
import HomeWork_3.calcs.simple.CalculatorWithMathExtends;
public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        double resSum = calculatorWithMathExtends.mult(15.0, 7.0);
        double resDiv = calculatorWithMathExtends.div(28.0, 5.0);
        double resDeg = calculatorWithMathExtends.deg(resDiv, 2.0);
        double resFinalSum = calculatorWithMathExtends.sum(resSum, resDeg);
        double result = 4.1 + resFinalSum;
        System.out.println(result);
    }
}
