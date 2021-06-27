package homeWork1;

/*
        7.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа.
*/

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от -128 до 127: ");
        byte num = in.nextByte();

        System.out.println("Введенное число: " + num + "\n" + "Двоичное представление: " + toBinaryString(num));
    }

    public static String toBinaryString(byte number) {

        String res = (String) Integer.toBinaryString(number);

        return res;
    }
}
