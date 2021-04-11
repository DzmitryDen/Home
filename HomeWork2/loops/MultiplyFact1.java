package HomeWork2.loops;

/**
1.1.1.
Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ

Использовать только цикл

Пользователь вводит число с клавиатуры.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyFact1 {

    public static void main(String[] args) throws IOException {

        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое положительное число от 1: ");
        String str = line.readLine();
        double numCheck = Double.parseDouble(str);
        long num = (long) numCheck;

        checkNumber(numCheck, num); // выводем сообщение с предупреждением

        // выходим из метода, если число дробное, равно нулю или отрицательное
        if (numCheck % num != 0 || numCheck == 0 || numCheck < 0) { return;}

        printResult(num, result(num));
    }

    // проверка на корректность введенного числа
    public static void checkNumber(double numCheck, long num) {
        if (numCheck == 0) {
            System.out.println("Вы ввели ноль");
            return;
        }
        if (numCheck < 0) {
            System.out.println("Вы ввели отрицательное число");
            return;
        }
        if (numCheck % num != 0) {
            System.out.println("Вы ввели не целое число");
            return;
        }
    }

    // перемножение (факториал числа)
    public static long result (long num) {
        long res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }

    // вывод результата в консоль в указанном формате
    public static void printResult (long num, long res) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i);
            if (i != num) {
                System.out.print(" * ");
            }
            if (i == num) {
                System.out.println(" = " + res);
            }
        }
    }
}
