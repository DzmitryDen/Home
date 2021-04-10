package HomeWork2.loops;

/*    1.4.* Умножать число long a = 1; пока не произойдёт переполнение.
В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
    	1.4.1. 3
    	1.4.2. 188
    	1.4.3. -19
    	1.4.4. Да и вообще на любое целочисленное

    	Пользователь вводит число с клавиатуры.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OverLong {

    public static void main(String[] args) throws  Exception{

        long maxLong = Long.MAX_VALUE;
        System.out.println("Максимальное значение long: " + maxLong);

        long minLong = Long.MIN_VALUE;
        System.out.println("Минимальное значение long: " + minLong);

        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целочисленное число не равное нулю: ");
        String numStr = line.readLine();

        // Выводим сообщение и выходим из метода, если введено не число
        if (isNum(numStr) == false) {
            System.out.println("Введено не число");
            return;
        }

        double num1 = Double.parseDouble(numStr); // парсим в double для проверки (если ввели не целое число)
        long num = (long) num1;

        checkNumber(num1, num, minLong, maxLong); // сообщаем, если введено некорректное число

        // Выходим из метода, если число степени дробное, равно нулю или выходит за допустимые границы long
        if (num1 % num != 0 || num == 0 || num1 < minLong || num1 > maxLong) { return; }

        result(num,minLong, maxLong); // вывод результата в консоль
    }

    // проверяем, что введенная строка является числом
    public static boolean isNum (String str){
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    // проверка на корректность введенного числа
    public static void checkNumber(double num1, long num, long minLong, long maxLong) {
        if (num == 0) {
            System.out.println("Вы ввели ноль");
            return;
        }
        if (num1 < minLong || num1 > maxLong ) {
            System.out.println("Вы ввели значение, выходящее за допустимые границы");
            return;
        }
        if (num1 % num != 0) {
            System.out.println("Вы ввели не целое число");
            return;
        }
    }

    // получаем резульат и выводим в консоль
    public static void result (long num, long minLong, long maxLong){
        double b = 1; // значение переменной которое будет изменятся до переполнения включительно

        while (b >= minLong && b <= maxLong) {
            b *=num;
        }
        System.out.println("Значение после переполнения:" + b);

        long a = (long) b / num; // последнее значение до переполнения

        System.out.println("Значение до переполнения: " + a);
    }


}
