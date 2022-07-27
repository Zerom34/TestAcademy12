package HomeWork_3.runners;
import HomeWork_3.calcs.simple.CalculatorWithMathCopy;
public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy CalculatorWithMathCopy=new CalculatorWithMathCopy();
        double resultMultiplication = CalculatorWithMathCopy.mult(15.0, 7.0);
        double resultDivision =CalculatorWithMathCopy.div(28.0, 5.0);
        double resultDegree=CalculatorWithMathCopy.deg(resultDivision,2.0);
        double resultAddition = CalculatorWithMathCopy.sum(resultMultiplication,resultDegree);
        double result=4.1+resultAddition;
        System.out.println(result);
    }
}