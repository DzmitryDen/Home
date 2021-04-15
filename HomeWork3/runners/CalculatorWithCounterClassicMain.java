package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {
        CalculatorWithCounterClassic calc4 = new CalculatorWithCounterClassic();

        // 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0) = 140.46

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;

        double multi = calc4.multiplication(b, c);// вычисляем произведение 15 * 7
        calc4.incrementCountOperation();
        double div = calc4.division(d, e); // вычисляем частное 28 / 5
        calc4.incrementCountOperation();
        double exp = calc4.exponent(div, 2); // возводим частное в квадрат (умножаем само на себя);
        calc4.incrementCountOperation();
        double sum1 = calc4.addition(a, multi); // находим первую сумму
        calc4.incrementCountOperation();
        double res = calc4.addition(sum1, exp); // находим результат
        calc4.incrementCountOperation();

        System.out.println("Результат выражения: " + res);
        System.out.println("Количество использований калькулятора: " + calc4.getCountOperation());
    }
}
