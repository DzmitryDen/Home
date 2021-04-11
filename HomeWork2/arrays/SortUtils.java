package HomeWork2.arrays;

import java.util.Arrays;

/** 4.* Выполнить сортировку массива с числами:
        4.1. После каждой сортировки в консоли у вас должно получиться
        "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
        Для преобразования массива в текст можно использовать класс Arrays.
        4.2. Создать класс SortsUtils. Пишем в нём следующие алгоритмы:
            4.2.1. Пузырьковая сортировка
            4.2.2. Шейкерная сортировка
        4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
            4.3.1. {1,2,3,4,5,6}
            4.3.2. {1,1,1,1}
            4.3.3. {9,1,5,99,9,9}
            4.3.4. {}
        4.4. После тестов написать код который будет массив через ранее созданный arrayRandom. Отсортировать.
        4.5. После рандома написать код который будет создавать массив через ранее созданный arrayFromConsole.
        Отсортировать.
 */


public class SortUtils {
    public static void main(String[] args) throws Exception{

        System.out.println ("Пузырьковая сортировка - Тест:\n");

        int[] arrB1 = {1,2,3,4,5,6};
        int[] arrB2 = {1,1,1,1};
        int[] arrB3 = {9,1,5,99,9,9};
        int[] arrB4 = {};

        bubbleSort(arrB1);
        bubbleSort(arrB2);
        bubbleSort(arrB3);
        bubbleSort(arrB4);

        System.out.println ("Шейкерная сортировка - Тест:\n");

        int[] arrS1 = {1,2,3,4,5,6};
        int[] arrS2 = {1,1,1,1};
        int[] arrS3 = {9,1,5,99,9,9};
        int[] arrS4 = {};

        int[] arrS5 = {78,46,62,32,52};

        shakerSort(arrS1);
        shakerSort(arrS2);
        shakerSort(arrS3);
        shakerSort(arrS4);

        shakerSort(arrS5);

        System.out.println ("Пузырьковая сортировка через ранее созданный arrayRandom: \n");

        bubbleSort(ArraysUtils.arrayRandom(5,100));

        System.out.println ("Пузырьковая сортировка через ранее созданный arrayFromConsole: \n");

        bubbleSort(ArraysUtils.arrayFromConsole());

        System.out.println ("Шейкерная сортировка через ранее созданный arrayRandom: \n");

        shakerSort(ArraysUtils.arrayRandom(5, 100));

        System.out.println ("Шейкерная сортировка через ранее созданный arrayFromConsole: \n");

        shakerSort(ArraysUtils.arrayFromConsole());
    }

    /**
     * Пузырьковая сортировка */
    public static void bubbleSort (int[] arr) {

        System.out.println("Массив до сортировки: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr [min] > arr[j]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        System.out.println("Массив после сортировки: " + Arrays.toString(arr));
        System.out.println();
    }

    /**
     * Шейкерная сортировка*/
    public static void shakerSort(int[] arr) {

        System.out.println("Массив до сортировки: " + Arrays.toString(arr));

        int size = arr.length;
        int leftBorder = 0;
        int rightBorder = size - 1;
        
        do {
            for (int i = leftBorder; i < rightBorder; i++) {
                if(arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
            rightBorder--;

            for (int i = rightBorder; i > leftBorder ; i--) {
                if(arr[i] < arr[i-1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                }
            }
            leftBorder++;
        } while (leftBorder < rightBorder);

        System.out.println("Массив после сортировки: " + Arrays.toString(arr));
        System.out.println();
    }
}
