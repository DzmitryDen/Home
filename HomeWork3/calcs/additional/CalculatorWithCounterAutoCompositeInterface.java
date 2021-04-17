package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface implements ICalculator{

    private long i = 0; // внутренний счетчик калькулятора

    ICalculator calculator;

    public CalculatorWithCounterAutoCompositeInterface (ICalculator calculator) {
        this.calculator = calculator;
    }

    public double division(double a, double b) {
        double res = calculator.division(a, b);
        i++;
        return res;
    }

    public double multiplication(double a, double b) {
        double res = calculator.multiplication(a, b);
        i++;
        return res;
    }

    public double subtraction(double a, double b) {
        double res = calculator.subtraction(a, b);
        i++;
        return res;
    }

    public double addition(double a, double b) {
        double res = calculator.addition(a, b);
        i++;
        return res;
    }

    public double exponent(double a, int b) {
        double res = calculator.exponent(a, b);
        i++;
        return res;
    }

    public double mod(double a) {
        double res = calculator.mod(a);
        i++;
        return res;
    }

    public double sqr(double a) {
        double res = calculator.sqr(a);
        i++;
        return res;
    }

    public long getCountOperation() {
        return i;
    }
}
