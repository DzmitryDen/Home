package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    long i = 0; // внутренний счетчик калькулятора

    /**
     * деление: a / b
     */
    public double division(double a, double b){
       double res = super.division(a, b);
       i++;
       return res;
    }

    /**
     * умножение: a * b
     */
    public double multiplication(double a, double b){
        double res = super.multiplication(a, b);
        i++;
        return res;
    }

    /**
     * вычитание: a - b
     */
    public double subtraction(double a, double b){
        double res = super.subtraction(a, b);
        i++;
        return res;
    }

    /**
     * сложение: a + b
     */
    public double addition(double a, double b){
        double res = super.addition(a, b);
        i++;
        return res;
    }

    /**
     * возведение в целую степень: a ^ b
     */
    public double exponent(double a, int b) {
        double res = super.exponent(a, b);
        i++;
        return res;
    }

    /**
     * модуль числа  a
     */
    public double mod(double a) {
        double res = super.mod(a);
        i++;
        return res;
    }

    /**
     * квадратный корень из числа  a
     */
    public double sqr(double a) {
        double res = super.sqr(a);
        i++;
        return res;
    }

    public long getCountOperation() {
        return i;
    }
}
