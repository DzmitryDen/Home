package HomeWork2.arrays;

/** 2.4 Все задачи в одном классе, в отдельных методах. Для создания массивов использовать ранее созданный arrayRandom.
        2.4.1. Сумма четных положительных элементов массива
        2.4.2. Максимальный из элементов массива с четными индексами
        2.4.3. Элементы массива, которые меньше среднего арифметического
        2.4.4. Найти два наименьших (минимальных) элемента массива
        2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
        2.4.6. Сумма цифр массива */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayTasks {

    public static void main(String[] args) throws Exception{

        System.out.println("Задан массив: ");
        int[] ArrTest = ArraysUtils.arrayRandom(5, 10);
        for (int i = 0; i < ArrTest.length; i++) {
            System.out.print(ArrTest[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Сумма четных положитльных элементов массива: " + sumPosit(ArrTest));
        System.out.println("Максимальный из элементов массива с четными индексами: " + maxEven(ArrTest));
        System.out.print("Элементы, которые меньше среднего арифметичиского: ");  minAverage(ArrTest);
        System.out.println();
        System.out.print("Два наименьших минимальных элемента: ");  twoMin(ArrTest);
        System.out.println();
        System.out.println("Сумма цифр массива: " + figSum(ArrTest));
        System.out.println();
        System.out.println("Сжимаем массив, удаляя элементы из заданного интервала");
        newArray(ArrTest);
    }

    // 2.4.1. Сумма четных положительных элементов массива
    public static int sumPosit (int[] arrMeth) {
        int Sum = 0;
        for (int i : arrMeth) {
            if (i > 0 && i % 2 ==0) {
                Sum +=i;
            }
        }
        return Sum;
    }

    // 2.4.2. Максимальный из элементов массива с четными индексами
    public static int maxEven (int[] arrMeth) {
        int max = arrMeth[2];
        for (int i = 2; i < arrMeth.length; i += 2) {
            if (max < arrMeth[i]) {
                max = arrMeth[i];
            }
        }
        return max;
    }

    // 2.4.3. Элементы массива, которые меньше среднего арифметического
    public static void minAverage (int[] arrMeth) {

        int Sum = 0;
        for (int i : arrMeth) {
            Sum += i;
        }
        double Average = (double) Sum / arrMeth.length;

        for (int i : arrMeth) {
            if (i < Average) {
                System.out.print(i + " ");
            }
        }
    }

    // 2.4.4. Найти два наименьших (минимальных) элемента массива
    public static void twoMin (int[] arrMeth) {

        int min1 = arrMeth[0]; // переменная для хранения 1го минимального значения
        for (int i = 1; i < arrMeth.length; i++) {
            int j = 0; // переменная для хранения индекса 1го минимального значения
            if(min1 > arrMeth[i]) {
                min1 = arrMeth[i];
                j = i;
            }
            int change; // переменная для обмена значениями
            change = arrMeth[0]; // 1ое минимальное значения помещено на первое место в массив
            arrMeth[0] = arrMeth[j];
            arrMeth[j] = change;
        }

        int min2 = arrMeth[1]; // переменная для хранения 2го минимального значения
        for (int i = 2; i < arrMeth.length; i++) {
            int j = 1; // переменная для хранения индекса 2го минимального значения
            if(min2 > arrMeth[i]) {
                min2 = arrMeth[i];
                j = i;
            }
            int change; // переменная для обмена значениями
            change = arrMeth[1]; // 2ое минимальное значения помещено на второе место в массив
            arrMeth[1] = arrMeth[j];
            arrMeth[j] = change;
        }
        System.out.print(arrMeth[0] + " " + arrMeth[1]);
    }

    // 2.4.6. Сумма цифр массива
    public static int figSum (int[] arrMeth) {

        int Sum = 0;
        for (int i : arrMeth) {

            int n = Math.abs(i); // модуль числа (элемента массива)
            while (n > 0) {
                Sum += n % 10;
                n /= 10;
            }
        }
        return Sum;
    }

    // 2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
    public static void newArray (int[] arrMeth) throws Exception{
        // Находим границы текущего массива
        int min = arrMeth[0];
        int max = arrMeth[0];
        for (int i = 1; i < arrMeth.length; i++) {
            if (min > arrMeth[i]) {
                min = arrMeth[i];
            }
            if(max < arrMeth[i]) {
                max = arrMeth[i];
            }
        }
        System.out.println("Границы массива: [" + min + ", " + max + "]");

        // Задаем границы интервала
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Задайте минимальную границу интервала (целое число): ");
        String minStr = line.readLine();
        int min1 = Integer. parseInt(minStr);

        System.out.print("Задайте максимальную границу интервала (целое число): ");
        String maxStr = line.readLine();
        int max1 = Integer. parseInt(maxStr);
        System.out.println("Задан интервал [" + min1 + ", " + max1 + "]");

        // Находим количество элементов массива из заданного интервала
        int n = 0; // счетчик элементов
        for (int i = 0; i < arrMeth.length; i++) {
            if(arrMeth[i] >= min1 && arrMeth[i] <= max1) {
                n++;
            }
        }

        // Создаем новый массив с размером без учета элементов из интервала
        int[] arr_1 = new int[arrMeth.length - n];

        // Заносим элементы не попадающие в интервал в новый массив
        int j = 0; // переменная-индекс нового массива
        for (int i = 0; i < arrMeth.length; i++) {
            if(arrMeth[i] >= min1 && arrMeth[i] <= max1) {
                continue;
            }
            arr_1[j] = arrMeth[i];
            j++;
        }

        // Выводим новый массив в консоль
        System.out.println("Новый массив: ");
        for (int i = 0; i < arr_1.length; i++) {
            System.out.print(arr_1[i] + " ");
        }
    }
}
