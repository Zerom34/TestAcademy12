package HomeWork_3.calcs.simple;
import HomeWork_3.calcs.api.ICalculator;
public class CalculatorWithMathCopy implements ICalculator{
    public double sum(double num1, double mum1) { //Сумма
        return num1 + mum1;
    }

    public double subtraction(double num2, double mum2){ //Разность
        return num2-mum2;
    }

    public double mult(double num3, double mum3) { //Произведение
        return num3*mum3;
    }

    public double div(double num4, double mum4){ //Частное
        return num4/mum4;
    }


    public double deg(double num5, double mum5) { //Возведение num5 в целочисоенную степнь mum5!
        return Math.pow(num5,mum5);
    }

    public double mod(double num6) { //Модуль числа!
        return Math.abs(num6);
    }


    public double sqNumb(double num7) { //Нахождение квадратного корня
        return Math.sqrt(num7);
    }
}
