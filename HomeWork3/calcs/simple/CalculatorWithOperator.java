package HomeWork3.calcs.simple;

public class CalculatorWithOperator {

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
    public double exponent(double a, int b){
        double res = 1;

        if (b == 0) {
            res = 1.0;
        }

        if(b > 0) {
            while (b > 0) {
                res *= a;
                b --;
            }
        }

        if (b < 0) {
            int b1 = -1 * b; // модуль
            double res1 = 1; // переменная для промежуточного результата
            while (b1 > 0) {
                res1 *= a;
                res = 1 / res1;
                b1 --;
            }
        }
        return res;
    }

    /**
     * модуль числа  a
     */
    public double mod(double a) {
        double res = a;
        if(a < 0 ) {
            res = -1 * a;
        }
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
