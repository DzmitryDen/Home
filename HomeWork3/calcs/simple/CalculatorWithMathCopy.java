package HomeWork3.calcs.simple;

public class CalculatorWithMathCopy {

    /**
     * деление: a / b
     */
    public double division(double a, double b){
        double res = a / b;
        return res;
    }

    /**
     * умножение: a * b
     */
    public double multiplication(double a, double b){
        double res = a * b;
        return res;
    }

    /**
     * вычитание: a - b
     */
    public double subtraction(double a, double b){
        double res = a - b;
        return res;
    }

    /**
     * сложение: a + b
     */
    public double addition(double a, double b){
        double res = a + b;
        return res;
    }

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
