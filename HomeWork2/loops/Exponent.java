package HomeWork2.loops;

/*
1.3. Возведение в степень. Через консоль пользователь вводит два числа.
Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число.
Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным.
Math использовать нельзя.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exponent {

    public static void main(String[] args) throws Exception {

        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число, которое необходимо возвести в степень: ");
        String numStr = line.readLine();

        // Выводим сообщение и выходим из метода, если введено не число
        if (isNum(numStr) == false) {
            System.out.println("Введено не число");
            return;
        }

        double num = Double.parseDouble(numStr); // парсим строку в число

        System.out.println("Введите значение степени (целое положительное число): ");
        String expStr = line.readLine();

        // Выводим сообщение и выходим из метода, если введено не число
        if (isNum(expStr) == false) {
            System.out.println("Введено не число");
            return;
        }

        double exp1 = Double.parseDouble(expStr); // парсим в double для проверки (если ввели не целое число)
        int exp = (int) exp1;

        checkExp(exp1, exp); // проверка корректности введенного числа

        // Выходим из метода, если число степени дробное, равно нулю или отрицательное
        if (exp1 % exp != 0 || exp1 == 0 || exp1 < 0) { return; }

        // Вычисляем и выводим результат
        result(num, exp);
    }


        // проверяем, что введенная строка является числом
        public static boolean isNum (String str){
            return str.matches("-?\\d+(\\.\\d+)?");
        }

        // проверяем введенное число (должно быть положительное,  не ноль и не дробное)
        public static void checkExp ( double exp1, int exp){
            if (exp1 == 0) {
                System.out.println("Вы ввели ноль");
                return;
            }
            if (exp1 < 0) {
                System.out.println("Вы ввели отрицательное число");
                return;
            }
            if (exp1 % exp != 0) {
                System.out.println("Введено не целое число");
                return;
            }
        }

        // вычисляем результат и выводим на печать
        public static void result ( double num, int exp){
            double res = 1;
            if (num != 0) {
                for (int i = 1; i <= exp; i++) {
                    res *= num;
                }
            } else res = 0;

            System.out.println(num + " ^ " + exp + " = " + res);
        }
    }


