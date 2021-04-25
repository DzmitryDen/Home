package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    /**
     * деление: a / b
     */
    public double division(double a, double b){
        return a / b;
    }

    /**
     * умножение: a * b
     */
    public double multiplication(double a, double b){
        return  a * b;
    }

    /**
     * вычитание: a - b
     */
    public double subtraction(double a, double b){
        return a - b;
    }

    /**
     * сложение: a + b
     */
    public double addition(double a, double b){
        return  a + b;
    }

    /**
     * возведение в целую степень: a ^ b
     */
    public double exponent(double a, int b) {
        return Math.pow(a, b);
    }

    /**
     * модуль числа  a
     */
    public double mod(double a) {
        return Math.abs(a);
    }

    /**
     * квадратный корень из числа  a
     */
    public double sqr(double a) {
        return Math.sqrt(a);
    }
}
