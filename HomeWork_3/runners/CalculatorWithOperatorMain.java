package HomeWork_3.runners;
import HomeWork_3.calcs.simple.CalculatorWithOperator;
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator сalculatorWithOperator=new CalculatorWithOperator();
        double resultMultiplication = сalculatorWithOperator.mult(15.0, 7.0);
        double resultDivision =сalculatorWithOperator.div(28.0, 5.0);
        double resultDegree=сalculatorWithOperator.deg(resultDivision,2.0);
        double resultAddition = сalculatorWithOperator.sum(resultMultiplication,resultDegree);
        double result=4.1+resultAddition;
        System.out.println(result);
    }
}

