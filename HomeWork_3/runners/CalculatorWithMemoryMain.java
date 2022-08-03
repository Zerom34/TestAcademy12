package HomeWork_3.runners;

import HomeWork_3.calcs.additional.CalculatorWithMemory;
import HomeWork_3.calcs.api.ICalculator;
import HomeWork_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args){
        ICalculator iCalculator = new CalculatorWithMathCopy();
        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(iCalculator);
        double multiplicationResult = calculatorWithMemory.mult(15.0, 7.0);
        double divisionResult = calculatorWithMemory.div(28.0, 5.0);
        double degreeResult = calculatorWithMemory.deg(divisionResult, 2);
        double sumTwoResult = calculatorWithMemory.sum(multiplicationResult, degreeResult);
        double addition = calculatorWithMemory.sum(4.1, sumTwoResult); //Считаем
        calculatorWithMemory.memo();
        System.out.println(addition);
        System.out.println(calculatorWithMemory.getCountOperation());
        System.out.println(calculatorWithMemory.returnMemo());
    }
}