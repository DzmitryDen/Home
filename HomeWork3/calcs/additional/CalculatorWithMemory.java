package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator {

    private double mem = 0; // переменная хранящая значение памяти

    /**
     * Метод возвращает результат последней операции из памяти
     */
    public void getMemory() {
        System.out.println("Результат выполнения последней операции, хранящийся в памяти: " + this.mem);
        this.mem = 0;
    }

    ICalculator calculator;

    public CalculatorWithMemory (ICalculator calculator) {
        this.calculator = calculator;
    }

    public double division(double a, double b) {
        double res = calculator.division(a, b);
        this.mem = res;
        return res;
    }

    public double multiplication(double a, double b) {
        double res = calculator.multiplication(a, b);
        this.mem = res;
        return res;
    }

    public double subtraction(double a, double b) {
        double res = calculator.subtraction(a, b);
        this.mem = res;
        return res;
    }

    public double addition(double a, double b) {
        double res = calculator.addition(a, b);
        this.mem = res;
        return res;
    }

    public double exponent(double a, int b) {
        double res = calculator.exponent(a, b);
        this.mem = res;
        return res;
    }

    public double mod(double a) {
        double res = calculator.mod(a);
        this.mem = res;
        return res;
    }

    public double sqr(double a) {
        double res = calculator.sqr(a);
        this.mem = res;
        return res;
    }
}
