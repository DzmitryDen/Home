package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {

    public static void main(String[] args) {

        CalculatorWithOperator calc1 = new CalculatorWithOperator();

        // 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0) = 140.46

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;

        double multi = calc1.multiplication(b, c); // вычисляем произведение 15 * 7
        double div = calc1.division(d, e); // вычисляем частное 28 / 5
        double exp = calc1.exponent(div, 2); // возводим частное в квадрат (умножаем само на себя);
        double sum1 = calc1.addition(a, multi); // находим первую сумму
        double res = calc1.addition(sum1, exp); // находим результат

        System.out.println(res);
    }
}
