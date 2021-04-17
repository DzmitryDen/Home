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

    /**
     Выражение: 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0) = 140.46
     */

    private double a = 4.1;
    private double b = 15;
    private double c = 7;
    private double d = 28;
    private double e = 5;

    /**
     * возвращает произведение 15 * 7
     */
    public double getMulti() {
        double res = multiplication(this.b, this.c);
        return res;
    }

     /**
      * вычисляем частное 28 / 5
      */
     public double getDiv() {
         double res = division(this.d, this.e);
         return res;
     }

    /**
     * возводим частное в квадрат (умножаем само на себя)
     */
    public double getExp() {
        double res = exponent(getDiv(), 2);
        return res;
    }

    /**
     * вычисляем первую сумму
     */
    public double getSum() {
        double res = addition(this.a, getMulti());
        return res;
    }

    /**
     * вычисляем результат выражения
     */
    public double getResult() {
        double res = addition(getSum(), getExp());
        return res;
    }
}
