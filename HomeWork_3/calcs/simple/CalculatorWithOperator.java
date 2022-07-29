package HomeWork_3.calcs.simple;
import HomeWork_3.calcs.api.ICalculator;
public class CalculatorWithOperator implements ICalculator {
    public double sum(double num1, double mum1) { //Сумма
        double sum = num1 + mum1;
        return sum;
    }

    public double subtraction(double num2, double mum2){ //Разность
        double sub=num2-mum2;
        return sub;
    }

    public double mult(double num3, double mum3) { //Произведение
        double resMult=num3*mum3;
        return resMult;
    }

    public double div(double num4, double mum4){ //Частное
        double div =num4/mum4;
        return div;
    }


    public double deg(double num5, double mum5) { //Возведение num5 в целочисоенную степнь mum5
        double deg = 1;
        for (int i=0; i <= mum5; i++) {
            deg = num5*num5;
        }
        return deg;
    }

    public double mod(double num6) { //Модуль числа
        double resMod ;
        double a = 0;
        if (num6<0) resMod = -a;
        else {
            resMod = a;
        }
        return resMod;
    }


    public double sqNumb(double num7) { //Нахождение квадратного корня
        double resSqNumb=Math.sqrt(num7);
        return resSqNumb;
    }
}
