package homeWork3.calcs.api;

public interface ICalculator {
    /**
     * деление: a / b
     */
    public double division(double a, double b);

    /**
     * умножение: a * b
     */
    public double multiplication(double a, double b);

    /**
     * вычитание: a - b
     */
    public double subtraction(double a, double b);

    /**
     * сложение: a + b
     */
    public double addition(double a, double b);

    /**
     * возведение в целую степень: a ^ b
     */
    public double exponent(double a, int b);

    /**
     * модуль числа  a
     */
    public double mod(double a);

    /**
     * квадратный корень из числа  a
     */
    public double sqr(double a);
}
