package HomeWork_3.runners;
import HomeWork_3.calcs.additional.CalculatorWithCounterClassic;
public class CalculatorWithCounterClassicMain {
    public static void main(String args[]) {

        CalculatorWithCounterClassic calculatorwithcounterclassic = new CalculatorWithCounterClassic();
        double resSum = calculatorwithcounterclassic.mult(15.0, 7.0);
        calculatorwithcounterclassic.incrementCountOperation();
        double resDiv = calculatorwithcounterclassic.div(28.0, 5.0);
        calculatorwithcounterclassic.incrementCountOperation();
        double resDeg = calculatorwithcounterclassic.deg(resDiv, 2.0);
        calculatorwithcounterclassic.incrementCountOperation();
        double resFinalSum = calculatorwithcounterclassic.sum(resSum, resDeg);
        calculatorwithcounterclassic.incrementCountOperation();
        double result = calculatorwithcounterclassic.sum(4.1, resFinalSum);
        System.out.println(result);

        /**
         * В придачу к стандартному нахождение уравнения, так же провести подсчет использований калькулятора и вывод данного подсчета.
         */
        System.out.println("Калькулятор был использован " + calculatorwithcounterclassic.getCountOperation() + " раз");
    }
}

