package homeWork1;

/*
        6.* Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет
    принимает один параметр и будет возвращать строку в отформатированном виде. В метод будет передаваться
    массив из 10 цифр (от 0 до 9). Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX.
    Например передан массив: {1,2,3,4,5,6,7,8,9,0}, возвращаемый результат: (123) 456-7890.
*/

public class Task6 {
    public static void main(String[] args) {

        // Параметр для передачи в метод (порядок цифр в массиве можно изменять)
        int[] num_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        // Результат вызова метода выводим в консоль
        System.out.println(createPhoneNumber(num_1));
    }

    public static String createPhoneNumber (int [] num) {

        // Преобразуем переданный массив int в строку
        StringBuilder sb = new StringBuilder();
        for (int i : num) {
            sb.append(i);
        }
        String str = sb.toString();

        // Работаем со строкой
        String str1 = str.substring(0,3); // первая часть номера
        String str2 = str.substring(3,6); // вторая часть номера
        String str3 = str.substring(6);   // третья часть номера

        String phone = "(" + str1  + ") " + str2 + "-" + str3;

        return phone;
    }
}
