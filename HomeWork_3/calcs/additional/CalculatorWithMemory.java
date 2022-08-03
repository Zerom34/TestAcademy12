package HomeWork_3.calcs.additional;
import HomeWork_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private final ICalculator iCalculator; //Поля (нач)
    private long counter;
    private double memory;
    private double lastRes;
    public CalculatorWithMemory(ICalculator iCalculator){ //Затем конструктор конструктор
        this.iCalculator = iCalculator;
    }

    //Сохранение выполненного метода
    private void lastRes(double lastResult) {
        this.lastRes = lastResult;
    }

    public void memo() {   //Последняя опрерация в памяти
        memory = lastRes;
    }

    public double returnMemo() { //Возвращает результат последней операции, удаляет из памяти
        double tmp = memory;
        memory = 0;
        return tmp;
    }

    public long getCountOperation() {
        return counter;
    }

    public double div(double dividend, double divider) {
        counter++;
        lastRes(iCalculator.div(dividend, divider));
        return iCalculator.div(dividend, divider);
    }

    public double mult(double firstMultiply, double secondMultiply) {
        counter++;
        lastRes(iCalculator.mult(firstMultiply, secondMultiply));
        return iCalculator.mult(firstMultiply, secondMultiply);
    }

    public double subtraction(double firstSubtraction, double secondSubtraction) {
        counter++;
        lastRes(iCalculator.subtraction(firstSubtraction, secondSubtraction));
        return iCalculator.subtraction(firstSubtraction, secondSubtraction);
    }

    public double sum(double firstAddition, double secondAddition) {
        counter++;
        lastRes(iCalculator.sum(firstAddition, secondAddition));
        return iCalculator.sum(firstAddition, secondAddition);
    }

    public double deg(double number, int numberDegree) {
        counter++;
        lastRes(iCalculator.deg(number, numberDegree));
        return iCalculator.deg(number, numberDegree);
    }

    public double mod(double moduleNum) {
        counter++;
        lastRes(iCalculator.mod(moduleNum));
        return iCalculator.mod(moduleNum);
    }

    public double sqNumb(double rootNum) {
        counter++;
        lastRes(iCalculator.sqNumb(rootNum));
        return iCalculator.sqNumb(rootNum);
    }
}
