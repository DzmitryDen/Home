package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {

        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();

        // 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0) = 140.46

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;

        double multi = calc3.multiplication(b, c); // вычисляем произведение 15 * 7
        double div = calc3.division(d, e); // вычисляем частное 28 / 5
        double exp = calc3.exponent(div, 2); // возводим частное в квадрат (умножаем само на себя);
        double sum1 = calc3.addition(a, multi); // находим первую сумму
        double res = calc3.addition(sum1, exp); // находим результат

        System.out.println("Результат выражения: " + res);
    }
}
