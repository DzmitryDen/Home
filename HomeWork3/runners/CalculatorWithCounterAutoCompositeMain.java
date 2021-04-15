package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {


        CalculatorWithCounterAutoComposite calculatorOp = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());
        CalculatorWithCounterAutoComposite calculatorCop = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoComposite calculatorEx = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());

        // 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0) = 140.46

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;

        /**
         * Делегируем выполнение калькулятору CalculatorWithOperator
         */
        double multi = calculatorOp.multiplicationOP(b, c); // вычисляем произведение 15 * 7
        double div = calculatorOp.divisionOP(d, e); // вычисляем частное 28 / 5
        double exp = calculatorOp.exponentOP(div, 2); // возводим частное в квадрат (умножаем само на себя);
        double sum1 = calculatorOp.additionOP(a, multi); // находим первую сумму
        double res = calculatorOp.additionOP(sum1, exp); // находим результат

        System.out.println("Вычисление выполняет калькулятор CalculatorWithOperator");
        System.out.println("Результат выражения: " + res);
        System.out.println("Количество использований калькулятора: "  + calculatorOp.getCountOperation());
        System.out.println();

        /**
         * Делегируем выполнение калькулятору CalculatorWithMathCopy
         */
        double multi1 = calculatorCop.multiplicationCop(b, c); // вычисляем произведение 15 * 7
        double div1 = calculatorCop.divisionCop(d, e); // вычисляем частное 28 / 5
        double exp1 = calculatorCop.exponentCop(div1, 2); // возводим частное в квадрат (умножаем само на себя);
        double sum1_1 = calculatorCop.additionCop(a, multi1); // находим первую сумму
        double res1= calculatorCop.additionCop(sum1_1, exp1); // находим результат

        System.out.println("Вычисление выполняет калькулятор CalculatorWithMathCopy");
        System.out.println("Результат выражения: " + res1);
        System.out.println("Количество использований калькулятора: "  + calculatorCop.getCountOperation());
        System.out.println();

        /**
         * Делегируем выполнение калькулятору CalculatorWithMathExtends
         */
        double multi2 = calculatorEx.multiplicationEx(b, c); // вычисляем произведение 15 * 7
        double div2 = calculatorEx.divisionEx(d, e); // вычисляем частное 28 / 5
        double exp2 = calculatorEx.exponentEx(div2, 2); // возводим частное в квадрат (умножаем само на себя);
        double sum1_2 = calculatorEx.additionEx(a, multi2); // находим первую сумму
        double res2= calculatorEx.additionEx(sum1_2, exp2); // находим результат

        System.out.println("Вычисление выполняет калькулятор CalculatorWithMathExtends");
        System.out.println("Результат выражения: " + res2);
        System.out.println("Количество использований калькулятора: "  + calculatorEx.getCountOperation());
        System.out.println();

    }
}
