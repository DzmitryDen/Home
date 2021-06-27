package homeWork3.calcs.additional;

import homeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface implements ICalculator{

    /**
     * переменная - счетчик
     */
    private long i;

    private ICalculator calculator;

    /**
     * конструктор
     */
    public CalculatorWithCounterAutoCompositeInterface (ICalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * метод, увеличивающий счетчик на 1
     */
    public void incrementCountOperation() {
        this.i++;
    }

    public double division(double a, double b) {
        incrementCountOperation();
        return calculator.division(a, b);
    }

    public double multiplication(double a, double b) {
        incrementCountOperation();
        return calculator.multiplication(a, b);
    }

    public double subtraction(double a, double b) {
        incrementCountOperation();
        return calculator.subtraction(a, b);
    }

    public double addition(double a, double b) {
        incrementCountOperation();
        return calculator.addition(a, b);
    }

    public double exponent(double a, int b) {
        incrementCountOperation();
        return calculator.exponent(a, b);
    }

    public double mod(double a) {
        incrementCountOperation();
        return calculator.mod(a);
    }

    public double sqr(double a) {
        incrementCountOperation();
        return calculator.sqr(a);
    }

    public long getCountOperation() {
        return i;
    }
}
