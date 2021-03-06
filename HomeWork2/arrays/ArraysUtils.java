package HomeWork2.arrays;

/**	2.1. Создать класс ArraysUtils:
		2.1.1. Написать метод public static int[] arrayFromConsole() рядом с main.
		Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.

		2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
		Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
		Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ArraysUtils {

    public static void main(String[] args) throws Exception {

        /** 2.1.1.1. Пример int[] container = arrayFromConsole().
 Результат: В методе arrayFromConsole будет запрошена информация у пользователя,пользователь вводит размер (3)
 и его элементы по порядку {4, 17, 32}. Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32}
 и сохранён в переменную container.
 */
        System.out.println("Пример отработки метода arrayFromConsole:");
        int[] container  = arrayFromConsole();
        for (int i = 0; i < container.length ; i++) {
            System.out.print(container[i] + " ");
        }

        System.out.println("\n");

        /** 2.1.2.1. Пример: int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан
массив размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.
*/
        System.out.println("Пример отработки метода arrayRandom:");
        int[] container1 = arrayRandom(5, 100);
        for (int i = 0; i < container1.length ; i++) {
            System.out.print(container1[i] + " ");
        }
    }

    /** Метод запрашивает размер массива и каждый его элемент у пользователя через консоль.*/
    public static int[] arrayFromConsole() throws Exception {
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Задайте размер массива (целое число): ");
        String sizeStr = line.readLine();
        int size = Integer. parseInt(sizeStr);

        int[] arr = new int[size]; // объявляем массив с заданным размером

        for (int i = 0; i < size; i++) {
            System.out.print("Задайте " + (i+1) + " элемент массива (целое число): ");
            String elemStr = line.readLine();
            arr[i] = Integer.parseInt(elemStr);
        }
        return arr;
    }

    /** Метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.*/
    public static int[] arrayRandom (int size, int maxValueExclusion) {

        int [] arr = new int[size]; // объявляем массив с заданным размером
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(maxValueExclusion);
        }
        return arr;
    }
}
