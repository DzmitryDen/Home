package homeWork1;

import java.util.Scanner;

/*
    Что в итоге надо сделать (общее условие):
    Запросить у пользователя его имя.
		1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке,
	а на второй "Я тебя так долго ждал".
		2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
		3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
	Как это сделать:
	5.1 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if
*/

public class Task5_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine(); // записываем вводимое значение в переменную name

        // получаем сообщение в зависимости от условия
        checkName(name);
    }

    public static void checkName (String name) {

        // Переменные для сравнения
        String name1 = "Вася";
        String name2 = "Анастасия";

        if(name.equals(name1))
            System.out.println("Привет! \n" + "Я тебя так долго ждал");

        if(name.equals(name2))
            System.out.println("Я тебя так долго ждал");

        if(!name.equals(name1) && !name.equals(name2))
            System.out.println("Добрый день, а вы кто?");
    }
}
