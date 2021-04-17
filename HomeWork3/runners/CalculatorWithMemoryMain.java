package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithMemory;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        System.out.println("Вычисление выполняет калькулятор CalculatorWithMathCopy\n");

        CalculatorWithMemory cop = new CalculatorWithMemory(new CalculatorWithMathCopy());
        ICalculator iCalculator = cop;

        /**
         Выражение: 4.1 + 15 * 7 + (28 / 5.0) * (28 / 5.0) = 140.46
         */

        System.out.println("Вычисляем произведение 15 * 7. Результат: "+ cop.getMulti());
        cop.getMemory();
        System.out.print("Память очищена. "); cop.getMemory();
        System.out.println();

        System.out.println("Вычисляем частное 28 / 5. Результат: "+ cop.getDiv());
        cop.getMemory();
        System.out.print("Память очищена. "); cop.getMemory();
        System.out.println();

        System.out.println("Возводим частное в квадрат (умножаем само на себя). Результат: "+ cop.getExp());
        cop.getMemory();
        System.out.print("Память очищена. "); cop.getMemory();
        System.out.println();

        System.out.println("Вычисляем первую сумму. Результат: "+ cop.getSum());
        cop.getMemory();
        System.out.print("Память очищена. "); cop.getMemory();
        System.out.println();

        System.out.println("Вычисляем результат выражения. Результат: "+ cop.getResult());
        cop.getMemory();
        System.out.print("Память очищена. "); cop.getMemory();
        System.out.println();
    }
}
