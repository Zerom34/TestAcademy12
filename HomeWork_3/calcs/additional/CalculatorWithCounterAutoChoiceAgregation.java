package HomeWork_3.calcs.additional;
import HomeWork_3.calcs.simple.CalculatorWithMathCopy;
import HomeWork_3.calcs.simple.CalculatorWithMathExtends;
import HomeWork_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    public CalculatorWithOperator cwo;
    public CalculatorWithMathCopy cwmc;
    public CalculatorWithMathExtends cwme;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc) {
        this.cwo = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc) {
        this.cwmc = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc) {
        this.cwme = calc;
    }

    private long counter = 0;

    public long getCountOperation() {
        return counter;
    }

    public double sum(double x, double y) {
        counter++;
        if (cwo != null) {
            return cwo.sum(x, y);
        } else if (cwmc != null) {
            return cwmc.sum(x, y);
        } else {
            return cwme.sum(x, y);
        }
    }

    public double subtraction(double x, double y) {
        counter++;
        if (cwo != null) {
            return cwo.subtraction(x, y);
        } else if (cwmc != null) {
            return cwmc.subtraction(x, y);
        } else {
            return cwme.subtraction(x, y);
        }
    }

    public double mult(double x, double y) {
        counter++;
        if (cwo != null) {
            return cwo.mult(x, y);
        } else if (cwmc != null) {
            return cwmc.mult(x, y);
        } else {
            return cwme.mult(x, y);
        }
    }

    public double div(double x, double y) {
        counter++;
        if (cwo != null) {
            return cwo.div(x, y);
        } else if (cwmc != null) {
            return cwmc.div(x, y);
        } else {
            return cwme.div(x, y);
        }
    }

    public double deg(double x, int y) {
        counter++;
        if (cwo != null) {
            return cwo.deg(x, y);
        } else if (cwmc != null) {
            return cwmc.deg(x, y);
        } else {
            return cwme.deg(x, y);
        }
    }

    public double mod(double x) {
        counter++;
        if (cwo != null) {
            return cwo.mod(x);
        } else if (cwmc != null) {
            return cwmc.mod(x);
        } else {
            return cwme.mod(x);
        }
    }

    public double sqNumb(double x) {
        counter++;
        if (cwo != null) {
            return cwo.sqNumb(x);
        } else if (cwmc != null) {
            return cwmc.sqNumb(x);
        } else {
            return cwme.sqNumb(x);
        }
    }

}
