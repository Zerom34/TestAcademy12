package HomeWork_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    public double sum(double num1, double mum1) {
        return super.sum(num1, mum1);
    }


    public double subtraction(double num2, double mum2) {
        return super.subtraction(num2, mum2);
    }

    public double mult(double num3, double mum3) {
        return super.mult(num3, mum3);
    }

    public double div(double num4, double mum4) {
        return super.div(num4, mum4);
    }

    public double deg(double num5, int mum5) {
        return Math.pow(num5, mum5);
    }

    public double mod(double num6) {
        return Math.abs(num6);
    }

    public double sqNumb(double num7) {
        return Math.sqrt(num7) ;
    }
}