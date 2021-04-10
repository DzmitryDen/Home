package HomeWork2.loops;

/*
1.2.
Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой
и вывести ход вычислений в консоль. Пользователь обязан ввести целое число.
Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.

Пользователь вводит число с клавиатуры.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiplyNum {
    public static void main(String[] args) throws Exception {

        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое число: ");
        String str = line.readLine();

        // Выводим сообщение и выходим из метода, если введено не число
        if(isNum(str) == false) {
            System.out.println("Введено не число");
            return;
        }

        double numCheck1 = Double.parseDouble(str);
        double numCheck = Math.abs(numCheck1); // находим модуль (пользователь мог ввести отрицательное)
        long num = (long) numCheck;

        // Выводим сообщение, если число дробное или ноль
        checkNumber(numCheck, num);

        // Выходим из метода, если число дробное или ноль
        if (numCheck % num != 0 || numCheck == 0) { return;}

        // Вычисляем результат перемножения чисел
        long res = result(num);

        // Печать результата
        printRes(str, res);
    }

    // проверяем, что введенная строка является числом
    public static boolean isNum (String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    // Проверяем введенное число (должно быть не ноль и не дробное)
    public static void checkNumber(double numCheck, long num) {
        if (numCheck == 0) {
            System.out.println("Вы ввели ноль");
            return;
        }
        if (numCheck % num != 0) {
            System.out.println("Введено не целое число");
            return;
        }
    }

    // Вычисляем результат (перемножение чисел)
    public static long result (long num) {
        long res = 1;
        while (num > 0) {
            int n = (int) num % 10;
            if (n > 0) {
                res = res * n;
            }
            num = num / 10;
        }
        return res;
    }

    // Выводим результат на печать в корректном формате
    public static void printRes (String str, long res) {
        String str1 = str.replace("0", ""); // удаляем со строки нули
        String str2 = str1.replace("-", ""); // удалеяем "минус", если число отрицательное

        int a = str2.length(); // длина строки
        for (int i = 0; i < a; i++) {
            System.out.print(str2.substring(i, i+1));
            if (i != a-1) {
                System.out.print(" * ");
            }
            if(i == a-1) {
                System.out.println(" = " + res);
            }
        }
    }
}
