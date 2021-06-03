package HomeWork2.arrays.ArraysRun_1;
import HomeWork2.arrays.ArraysUtils;

/**	2.3* Выполнить задание 2.2 иным способом. Создать интерфейс IArraysOperation с методами из задания. Написать 4 отдельных класса и реализовать данный интерфейс:
            2.3.1. DoWhileOperation - во всех методах можно использовать только do....while
            2.3.2. WhileOperation - во всех методах можно использовать только while
            2.3.3. ForOperation - во всех методах можно использовать только for
            2.3.4. ForEachOperation - во всех методах можно использовать только foreach*/


public class ArrMain {
    public static void main(String[] args) throws Exception {

        DoWhileOperation type1 = new DoWhileOperation();
        WhileOperation type2 = new WhileOperation();
        ForOperation type3 = new ForOperation();
        ForEachOperation type4 = new ForEachOperation();

        System.out.println("Во всех методах использован только do...while\n");
        type1.printAll(ArraysUtils.arrayFromConsole());
        System.out.println();
        type1.printAllSecond(ArraysUtils.arrayFromConsole());
        System.out.println();
        type1.printAllRevers(ArraysUtils.arrayFromConsole());
        System.out.println("\n");

        System.out.println("Во всех методах использован только while\n");
        type2.printAll(ArraysUtils.arrayFromConsole());
        System.out.println();
        type2.printAllSecond(ArraysUtils.arrayFromConsole());
        System.out.println();
        type2.printAllRevers(ArraysUtils.arrayFromConsole());
        System.out.println("\n");

        System.out.println("Во всех методах использован только for\n");
        type3.printAll(ArraysUtils.arrayFromConsole());
        System.out.println();
        type3.printAllSecond(ArraysUtils.arrayFromConsole());
        System.out.println();
        type3.printAllRevers(ArraysUtils.arrayFromConsole());
        System.out.println("\n");

        System.out.println("Во всех методах использован только foreach\n");
        type4.printAll(ArraysUtils.arrayFromConsole());
        System.out.println();
        type4.printAllSecond(ArraysUtils.arrayFromConsole());
        System.out.println();
        type4.printAllRevers(ArraysUtils.arrayFromConsole());
        System.out.println("\n");
    }
}
