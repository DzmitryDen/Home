package homeWork3.calcs.additional;

import homeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    /**
     * переменная - счетчик
     */
    private long i;

    /**
     * метод, увеличивающий счетчик на 1
     */
    public void incrementCountOperation() {
        this.i++;
    }

    /**
     * деление: a / b
     */
/*    public double division(double a, double b){
       double res = super.division(a, b);
       i++;
       return res;
    }*/

    @Override
    public double division(double a, double b) {
        incrementCountOperation();
        return super.division(a, b);
    }

    /**
     * умножение: a * b
     */
/*    public double multiplication(double a, double b){
        double res = super.multiplication(a, b);
        i++;
        return res;
    }*/

    @Override
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return super.multiplication(a, b);
    }

    /**
     * вычитание: a - b
     */
/*    public double subtraction(double a, double b){
        double res = super.subtraction(a, b);
        i++;
        return res;
    }*/

    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return super.subtraction(a, b);
    }

    /**
     * сложение: a + b
     */
/*    public double addition(double a, double b){
        double res = super.addition(a, b);
        i++;
        return res;
    }*/

    @Override
    public double addition(double a, double b) {
        incrementCountOperation();
        return super.addition(a, b);
    }

    /**
     * возведение в целую степень: a ^ b
     */
/*    public double exponent(double a, int b) {
        double res = super.exponent(a, b);
        i++;
        return res;
    }*/

    @Override
    public double exponent(double a, int b) {
        incrementCountOperation();
        return super.exponent(a, b);
    }

    /**
     * модуль числа  a
     */
/*    public double mod(double a) {
        double res = super.mod(a);
        i++;
        return res;
    }*/

    @Override
    public double mod(double a) {
        incrementCountOperation();
        return super.mod(a);
    }

    /**
     * квадратный корень из числа  a
     */
/*    public double sqr(double a) {
        double res = super.sqr(a);
        i++;
        return res;
    }*/

    @Override
    public double sqr(double a) {
        incrementCountOperation();
        return super.sqr(a);
    }

    public long getCountOperation() {
        return i;
    }
}
