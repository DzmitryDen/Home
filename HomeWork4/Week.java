package HomeWork4;

/**
 * 3. Написать метод String toWeek(int day).
 * 	3.1 В данном методе посчитать количество прошедших недель по переданному числу дней.
 * 	3.2 Пример передали: 5. Получили "0 недель"
 * 	3.3 Пример передали: 14. Получили "2 недели"
 * 	3.4 Пример передали: 177. Получили "25 недель"
 */

public class Week {

    public static void main(String[] args) {

        System.out.println(toWeek(6));

    }

    public static String toWeek(int day) {

        String[] weekText = {"недель", "неделя", "недели"};

        /**
         * переменная, хранящая сообщение
         */
        String message;

        /**
         * переменная, хранящая полное количество недель
         */
        int week = day / 7;

        /**
         * переменная, хранящую остаток от деления на 10
         */
        int a = week % 10;

        /**
         * переменная, хранящую остаток от деления на 100
         */
        int b = week % 100;

        if (a == 0 || (a >= 5 && a <= 9) || (b >= 11 && b <= 14)) {
            message = week + " " + weekText[0];
        } else if (a == 1) {
            message = week + " " + weekText[1];
        } else {
            message = week + " " + weekText[2];
        }

        return message;
    }
}
