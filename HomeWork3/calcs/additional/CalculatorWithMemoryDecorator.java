package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryDecorator implements ICalculator{

    ICalculator calculator;


    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    ICalculator getCalculator() {
        return calculator;
    }


    @Override
    public double division(double a, double b) {
        return getCalculator().division(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        return getCalculator().multiplication(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        return getCalculator().subtraction(a, b);
    }

    @Override
    public double addition(double a, double b) {
        return getCalculator().addition(a, b);
    }

    @Override
    public double exponent(double a, int b) {
        return getCalculator().exponent(a, b);
    }

    @Override
    public double mod(double a) {
        return getCalculator().mod(a);
    }

    @Override
    public double sqr(double a) {
        return getCalculator().sqr(a);
    }


}
