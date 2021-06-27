package homeWork3.runners;

import homeWork3.calcs.additional.CalculatorWithMemory;
import homeWork3.calcs.api.ICalculator;
import homeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        System.out.println("Вычисление выполняет калькулятор CalculatorWithMathCopy\n");

        CalculatorWithMemory cop = new CalculatorWithMemory(new CalculatorWithMathCopy());
        ICalculator iCalculator = cop;

        /**
         Выражение: 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0) = 140.46
         */

        System.out.println("Вычисляем произведение 15 * 7. Результат: " + cop.multiplication(15,7)); // 105
        cop.getMemory();
        System.out.print("Память очищена. "); cop.getMemory();
        System.out.println();

        System.out.println("Вычисляем частное 28 / 5. Результат: " + cop.division(28,5)); // 5.6
        cop.getMemory();
        System.out.print("Память очищена. "); cop.getMemory();
        System.out.println();

        System.out.println("Возводим частное в квадрат (умножаем само на себя). Результат: " +
                cop.exponent(5.6,2)); // 31.36
        cop.getMemory();
        System.out.print("Память очищена. "); cop.getMemory();
        System.out.println();

        System.out.println("Вычисляем первую сумму. Результат: " + cop.addition(4.1, 105)); // 109.1
        cop.getMemory();
        System.out.print("Память очищена. "); cop.getMemory();
        System.out.println();

        System.out.println("Вычисляем результат выражения. Результат: " +
                cop.addition(109.1, 31.36));
        cop.getMemory();
        System.out.print("Память очищена. "); cop.getMemory();
        System.out.println();
    }
}
