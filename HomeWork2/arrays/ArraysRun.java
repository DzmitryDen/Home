package HomeWork2.arrays;

/**
2.2 Перебор массива при помощи do....while, while, for, foreach.
Элементы массива вводить используя ранее созданный arrayFromConsole.
Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода:
		2.2.1. Вывести все элементы в консоль.
		2.2.2. Вывести каждый второй элемент массива в консоль.
		2.2.3. Вывести все элементы массива в консоль в обратном порядке
*/

public class ArraysRun {

    public static void main(String[] args) throws Exception {

        /** for */
        System.out.println("Перебор массива с помощью for");
        runFor(ArraysUtils.arrayFromConsole());
        System.out.println("\n");

        /** while */
        System.out.println("Перебор массива с помощью while");
        runWhile(ArraysUtils.arrayFromConsole());
        System.out.println("\n");

        /** do...while */
        System.out.println("Перебор массива с помощью do...while");
        runDoWhile(ArraysUtils.arrayFromConsole());
        System.out.println("\n");

        /** foreach */
        System.out.println("Перебор массива с помощью foreach");
        runForeach(ArraysUtils.arrayFromConsole());
        System.out.println("\n");
    }

    /** Перебор массива с помощью for */
    public static void runFor (int[] arrMeth) {
        int[] container = arrMeth;

        System.out.print("Выводим все элементы массива: ");
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
        System.out.println();

        System.out.print("Выводим каждый второй элемет массива: ");
        for (int i = 1; i < container.length; i+=2) {
            System.out.print(container[i] + " ");
        }
        System.out.println();

        System.out.print("Выводим элементы массива в обратном порядке: ");
        for (int i = (container.length - 1); i >= 0; i--) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
    }

    /** Перебор массива с помощью while */
    public static void runWhile (int[] arrMeth) {

        int[] container = arrMeth;

        System.out.print("Выводим все элементы массива: ");
        int i = 0;
        while (i < container.length) {
            System.out.print(container[i] + " ");
            i++;
        }
        System.out.println();

        System.out.print("Выводим каждый второй элемент массива: ");
        int j = 1;
        while (j < container.length) {
            System.out.print(container[j] + " ");
            j += 2;
        }
        System.out.println();

        System.out.print("Выводим элементы массива в обратном порядке: ");
        int k = container.length-1;
        while (k >= 0 ) {
            System.out.print(container[k] + " ");
            k --;
        }
        System.out.println();
    }

    /** Перебор массива с помощью do...while */
    public static void runDoWhile (int[] arrMeth) {

        int[] container = arrMeth;

        System.out.print("Выводим все элементы массива: ");
        int i = 0;
        do {
            System.out.print(container[i] + " ");
            i++;
        }
        while (i < container.length) ;
        System.out.println();

        System.out.print("Выводим каждый второй элемент массива: ");
        int j = 1;
        do {
            System.out.print(container[j] + " ");
            j += 2;
        }
        while (j < container.length) ;
        System.out.println();

        System.out.print("Выводим элементы массива в обратном порядке: ");
        int k = container.length-1;
        do {
            System.out.print(container[k] + " ");
            k--;
        }
        while (k >= 0) ;
        System.out.println();
    }

    /** Перебор массива с помощью foreach */
    public static void runForeach (int[] arrMeth) {

        int[] container = arrMeth;

        System.out.print("Выводим все элементы массива: ");
        for (int i : container) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Выводим каждый второй элемент массива: ");
        int k = 1;
        for (int i : container) {
            if (k < container.length) {
                System.out.print(container[k] + " ");
                k += 2;
            }
        }
        System.out.println();

        System.out.print("Выводим элементы массива в обратном порядке: ");
        int l = container.length;
        for (int i : container) {
            if (l >= 0) {
                System.out.print(container[l-1] + " ");
                l --;
            }
        }
        System.out.println();
    }
}
