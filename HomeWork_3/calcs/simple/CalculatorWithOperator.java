package HomeWork_3.calcs.simple;
import HomeWork_3.calcs.api.ICalculator;
public class CalculatorWithOperator implements ICalculator {
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


    public double deg(double num5, double mum5) { //Возведение num5 в целочисоенную степнь mum5
        double deg = num5;
        for (int i=0; i < mum5-1; i++) {
            deg = deg*num5;
        }
        return deg;
    }

    public double mod(double num6) { //Модуль числа
        double resMod ;
        if (num6<0) resMod = -1 * num6;
        else {
            resMod = num6;
        }
        return resMod;
    }


    public double sqNumb(double num7) { //Нахождение квадратного корня
        return Math.sqrt(num7);
    }

}

