package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathCopyMain {

    public static void main(String[] args) {

        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        // 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0) = 140.46

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;

        countAndPrint(calc2, a, b, c, d, e);
    }

    public static void countAndPrint (CalculatorWithMathCopy calculator, double a, double b, double c, double d, double e) {

        double multi = calculator.multiplication(b, c); // вычисляем произведение 15 * 7
        double div = calculator.division(d, e); // вычисляем частное 28 / 5
        double exp = calculator.exponent(div, 2); // возводим частное в квадрат (умножаем само на себя);
        double sum = calculator.addition(a, multi); // находим первую сумму
        double res = calculator.addition(sum, exp); // находим результат

        System.out.println("Выражение: 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0)");
        System.out.println("Результат выражения: " + res);
    }
}
