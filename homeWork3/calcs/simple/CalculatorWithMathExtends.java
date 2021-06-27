package homeWork3.calcs.simple;

import homeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

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
