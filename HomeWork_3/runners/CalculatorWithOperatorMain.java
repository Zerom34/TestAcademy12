package HomeWork_3.runners;
import HomeWork_3.calcs.simple.CalculatorWithOperator;
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator CalculatorWithOperator=new CalculatorWithOperator();
        double resultMultiplication = CalculatorWithOperator.mult(15.0, 7.0);
        double resultDivision =CalculatorWithOperator.div(28.0, 5.0);
        double resultDegree=CalculatorWithOperator.deg(resultDivision,2.0);
        double resultAddition = CalculatorWithOperator.sum(resultMultiplication,resultDegree);
        double result=4.1+resultAddition;
        System.out.println(result);
    }
}

