package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface implements ICalculator{

    ICalculator calculator;

    public CalculatorWithCounterAutoCompositeInterface (ICalculator calculator) {
        this.calculator = calculator;
    }

    public double division(double a, double b) {
        double res = calculator.division(a, b);
        return res;
    }

    public double multiplication(double a, double b) {
        double res = calculator.multiplication(a, b);
        return res;
    }

    public double subtraction(double a, double b) {
        double res = calculator.subtraction(a, b);
        return res;
    }

    public double addition(double a, double b) {
        double res = calculator.addition(a, b);
        return res;
    }

    public double exponent(double a, int b) {
        double res = calculator.exponent(a, b);
        return res;
    }

    public double mod(double a) {
        double res = calculator.mod(a);
        return res;
    }

    public double sqr(double a) {
        double res = calculator.sqr(a);
        return res;
    }
}
