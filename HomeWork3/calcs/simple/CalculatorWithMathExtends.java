package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    /**
     * возведение в целую степень: a ^ b
     */
    public double exponent(double a, int b) {
        double res = Math.pow(a, b);
        return res;
    }

    /**
     * модуль числа  a
     */
    public double mod(double a) {
        double res = Math.abs(a);
        return res;
    }

    /**
     * квадратный корень из числа  a
     */
    public double sqr(double a) {
        double res = Math.sqrt(a);
        return res;
    }
}
