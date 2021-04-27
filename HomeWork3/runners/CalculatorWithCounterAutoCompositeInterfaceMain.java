package HomeWork3.runners;


import HomeWork3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoCompositeInterface cop = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoCompositeInterface op = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithOperator());
        CalculatorWithCounterAutoCompositeInterface ex = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends());

        ICalculator iCalculatorCop = cop;
        ICalculator iCalculatorOp = op;
        ICalculator iCalculatorEx = ex;

        // 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0) = 140.46

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;

        /**
         * Делегируем выполнение калькулятору CalculatorWithMathCopy
         */
        System.out.println();
        System.out.println("Вычисление выполняет калькулятор CalculatorWithMathCopy");
        countAndPrint(iCalculatorCop, a, b, c, d, e);
        System.out.println("Количество использований калькулятора: "  + cop.getCountOperation() + "\n");

        /**
         * Делегируем выполнение калькулятору CalculatorWithOperator
         */
        System.out.println("Вычисление выполняет калькулятор CalculatorWithOperator");
        countAndPrint(iCalculatorOp, a, b, c, d, e);
        System.out.println("Количество использований калькулятора: "  + op.getCountOperation() + "\n");

        /**
         * Делегируем выполнение калькулятору CalculatorWithMathExtends
         */
        System.out.println("Вычисление выполняет калькулятор CalculatorWithMathExtends");
        countAndPrint(iCalculatorEx, a, b, c, d, e);
        System.out.println("Количество использований калькулятора: "  + ex.getCountOperation() + "\n");


    }

    public static void countAndPrint (ICalculator calculator, double a, double b, double c, double d, double e) {

        double multi = calculator.multiplication(b, c); // вычисляем произведение 15 * 7
        double div = calculator.division(d, e); // вычисляем частное 28 / 5
        double exp = calculator.exponent(div, 2); // возводим частное в квадрат (умножаем само на себя);
        double sum = calculator.addition(a, multi); // находим первую сумму
        double res = calculator.addition(sum, exp); // находим результат

        System.out.println("Выражение: 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0)");
        System.out.println("Результат выражения: " + res);
    }
}
