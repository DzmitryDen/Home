package homeWork3.runners;

import homeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {
        CalculatorWithCounterClassic calc4 = new CalculatorWithCounterClassic();

        // 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0) = 140.46

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;

        countAndPrint(calc4, a, b, c, d, e);
    }

    public static void countAndPrint (CalculatorWithCounterClassic calculator, double a, double b, double c, double d, double e) {

        double multi = calculator.multiplication(b, c);// вычисляем произведение 15 * 7
        calculator.incrementCountOperation();
        double div = calculator.division(d, e); // вычисляем частное 28 / 5
        calculator.incrementCountOperation();
        double exp = calculator.exponent(div, 2); // возводим частное в квадрат (умножаем само на себя);
        calculator.incrementCountOperation();
        double sum = calculator.addition(a, multi); // находим первую сумму
        calculator.incrementCountOperation();
        double res = calculator.addition(sum, exp); // находим результат
        calculator.incrementCountOperation();

        System.out.println("Выражение: 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0)");
        System.out.println("Результат выражения: " + res);
        System.out.println("Количество использований калькулятора: " + calculator.getCountOperation());
    }
}
