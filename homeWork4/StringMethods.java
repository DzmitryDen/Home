package homeWork4;

/**
 * 1.* Написать метод String toString(int number).
 * 	1.1 В данном методе произвести конвертацию переданного числа в число прописью. Числа от - 999 999 999 до 999 999 999
 * 	1.2 Пример передали: 223. Получили "Двести двадцать три"
 *
 * 3. Написать метод String toWeek(int day).
 * 	3.1 В данном методе посчитать количество прошедших недель по переданному числу дней.
 * 	3.2 Пример передали: 5. Получили "0 недель"
 * 	3.3 Пример передали: 14. Получили "2 недели"
 * 	3.4 Пример передали: 177. Получили "25 недель"
 *
 * 4. Написать метод String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat).
 * 	4.1 В данном методе конвертируют переданные миллисекунды в количество часов, минут, секунд и миллисекунд.
 * 	4.2 В зависимости от параметра shortFormat возвращать либо короткое написание в формате
 * 	HH:mm:ss.SSS, где HH - это часы, mm - это минуты, ss - это секунды, SSS - это миллисекунды.
 * 	Либо полное написание
 * 	4.3 Пример передали: 7789001, true. Получили 02:09:49.001 -
 * 	прошу обратить что в цифрах могут быть ведущие нули: "02", "09"
 * 	4.4 Пример передали: 7789001, false. Получили 2 часа 9 минут 49 секунд 1 миллисекунда
 */

public class StringMethods {

    public static void main(String[] args) {

        System.out.println(toString(-124502301));
        System.out.println(toWeek(6));
        System.out.println(toHoursMinuteSecondMillisecond(7789000, true));

    }

    public static String toString (int number) {

        String [] hundred = {"", "сто ", "двести ", "триста ", "четыреста ",
                "пятьсот ", "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "};

        String [] ten = {"", "десять ", "двадцать ", "тридцать ", "сорок ",
                "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "};

        String [] ten1 = {"", "одинадцать ", "двенадцать ", "тринадцать ", "четырнадцать ",
                "пятнадцать ", "шестнадцать ", "семнадцать ", "восемнадцать ", "девятнадцать "};

        String [] one = {"", "один ", "два ", "три ", "четыре ", "пять ", "шесть ", "семь ", "восемь ", "девять "};
        String [] one1 = {"", "одна ", "две ", "три ", "четыре ", "пять" , "шесть ", "семь ", "восемь ", "девять "};

        String[] millionText = {"миллионов ", "миллион ", "миллиона "};
        String[] thousandText = {"тысяч ", "тысяча ", "тысячи "};

        int million, thousand, units; // количество миллионов, тысяч, единиц (соответственно)
        final int m = 1000000; // константа для вычисления миллионов
        final int t = 1000; // константа для вычисления тысяч

        int modNumber = Math.abs(number); // модуль переданного числа

        million = modNumber / m; // считаем количество миллионов
        modNumber = modNumber % m; // остаток числа без миллионов

        thousand = modNumber / t; // считаем количество тысяч
        units = modNumber % t; // остаток числа без тысяч

        String message = ""; // сообщение

        int M1 = million % 10; // переменная, хранящая остаток от деления Миллионов на 10
        int M2 = million % 100; // переменная, хранящая остаток от деления Миллионов на 100

        int T1 = thousand % 10; // переменная, хранящая остаток от деления Тысяч на 10
        int T2 = thousand % 100; // переменная, хранящая остаток от деления Тысяч на 100

        String textMil = checkNumber(million, hundred, ten, ten1, one);
        String textThous = checkNumber(thousand, hundred, ten, ten1, one1);
        String textUn = checkNumber(units, hundred, ten, ten1, one);

        message = textNumber(million, millionText, textMil) + textNumber(thousand, thousandText, textThous) + textUn;

        if (number < 0) message = "минус " + message;
        if (number == 0) message = "ноль";

        return message;
    }

    public static String checkNumber (int number, String[] h, String[] t, String[] t1, String[] o) {

        int a = number / 100; // первая цифра переданного числа
        int bd = number % 100; // хранит две последние цифры переданного числа
        int b = bd / 10; // хранит вторую цифру переданного числа
        int d = number % 10; // хранит третью цифру переданного числа

        String A = ""; // первая цифра прописью
        String BD = ""; // двузначное число прописью при условии < 20; >10
        String B = ""; // вторая цифра прописью
        String D = ""; // третья цифра прописью
        String text; // число прописью

        if (bd > 10 && bd < 20) {
            for (int i = 0; i <=9 ; i++) {
                if (a == i) A = h[i];
                if (bd == i + 10) BD = t1[i];
            }
            text = A + BD;
        } else {
            for (int i = 0; i <=9 ; i++) {
                if (a == i) A = h[i];
                if (b == i) B = t[i];
                if (d == i) D = o[i];
            }
            text = A + B + D;
        }

        return text;
    }

    public static String textNumber (int number, String[] numText, String text) {

        int N1 = number % 10; // переменная, хранящая остаток от деления Переданного числа на 10
        int N2 = number % 100; // переменная, хранящая остаток от деления Переданного числа на 100

        String textNumberFull;

        if ((N1 == 0 || (N1 >= 5 && N1 <= 9) || (N2 >= 11 && N2 <= 14)) && number != 0) {
            textNumberFull = text + numText[0];
        } else if (N1 == 1 && number != 0) {
            textNumberFull = text + numText[1];
        } else if (number != 0) {
            textNumberFull = text + numText[2];
        } else textNumberFull = "";

        return textNumberFull;
    }

    public static String toWeek(int day) {

        String[] weekText = {"недель", "неделя", "недели"};

        String message; // переменная, хранящая сообщение

        int week = day / 7; // переменная, хранящая полное количество недель

        int a = week % 10; // переменная, хранящую остаток от деления на 10

        int b = week % 100; // переменная, хранящую остаток от деления на 100

        if (a == 0 || (a >= 5 && a <= 9) || (b >= 11 && b <= 14)) {
            message = week + " " + weekText[0];
        } else if (a == 1) {
            message = week + " " + weekText[1];
        } else {
            message = week + " " + weekText[2];
        }

        return message;
    }

    public static String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {

        final int msH = 3600000; // Количество миллисекунд в часе
        final int msM = 60000; // Количество миллисекунд в минуте
        final int msS = 1000; // Количество миллисекунд в секунде

        int HH, mm, ss, SSS; // количество часов, минут, секунд, миллисекунд (соответственно)

        String message; // сообщение

        HH = (int) millisecond / msH; // считаем полное количество часов
        millisecond = millisecond - HH * msH; // количество миллисекунд, после подсчета часов

        mm = (int) millisecond / msM; // считаем полное количество минут
        millisecond = millisecond - mm * msM; // количество миллисекунд, после подсчета минут

        ss = (int) millisecond / msS; // считаем полное количество секунд
        SSS = (int) (millisecond - ss * msS); // считаем количество оставшихся миллисекунтд



        if (shortFormat) {
            message = messageForShort(HH, mm, ss, SSS);
        } else {
            message = messageForLong(HH, mm, ss, SSS);
        }

        return message;
    }

    public static String messageForShort (int HH, int mm, int ss, int SSS) {

        String tHH; // переменная для вывода часов текстом
        String tmm; // переменная для вывода минут текстом
        String tss; // переменная для вывода секунд текстом
        String tSSS; // переменная для вывода миллисекунд текстом
        String message; // сообщение

        if(HH < 10) {
            tHH = "0" + HH;
        } else {
            tHH = HH + "";
        }

        if(mm < 10) {
            tmm = "0" + mm;
        } else {
            tmm = mm + "";
        }

        if(ss < 10) {
            tss = "0" + ss;
        } else {
            tss = ss + "";
        }

        if(SSS < 10) {
            tSSS = "00" + SSS;
        } else if (SSS < 100){
            tSSS = "0" + SSS;
        } else {
            tSSS = SSS +"";
        }

        message = tHH + ":" + tmm + ":" + tss + "." + tSSS;

        return message;
    }

    public static String messageForLong (int HH, int mm, int ss, int SSS) {

        String tHH; // переменная для вывода часов текстом
        String tmm; // переменная для вывода минут текстом
        String tss; // переменная для вывода секунд текстом
        String tSSS; // переменная для вывода миллисекунд текстом
        String message; // сообщение

        String[] hourText = {"часов", "час", "часа"};
        String[] minuteText = {"минут", "минута", "минуты"};
        String[] secondText = {"секунд", "секунда", "секунды"};
        String[] millisecondText = {"миллисекунд", "миллисекунда", "миллисекунды"};

        int HH1 = HH % 10; // переменная, хранящую остаток от деления Часов на 10
        int HH2 = HH % 100; // переменная, хранящую остаток от деления Часов на 100

        int mm1 = mm % 10; // переменная, хранящую остаток от деления Минут на 10
        int mm2 = mm % 100; // переменная, хранящую остаток от деления Минут на 100

        int ss1 = ss % 10; // переменная, хранящую остаток от деления Секунд на 10
        int ss2 = ss % 100; // переменная, хранящую остаток от деления Секунд на 100

        int SSS1 = SSS % 10; // переменная, хранящую остаток от деления Миллисекунд на 10
        int SSS2 = SSS % 100; // переменная, хранящую остаток от деления Миллисекунд на 100

        if (HH1 == 0 || (HH1 >= 5 && HH1 <= 9) || (HH2 >= 11 && HH2 <= 14)) {
            tHH = HH + " " + hourText[0];
        } else if (HH1 == 1) {
            tHH = HH + " " + hourText[1];
        } else {
            tHH = HH + " " + hourText[2];
        }

        if (mm1 == 0 || (mm1 >= 5 && mm1 <= 9) || (mm2 >= 11 && mm2 <= 14)) {
            tmm = mm + " " + minuteText[0];
        } else if (mm1 == 1) {
            tmm = mm + " " + minuteText[1];
        } else {
            tmm = mm + " " + minuteText[2];
        }

        if (ss1 == 0 || (ss1 >= 5 && ss1 <= 9) || (ss2 >= 11 && ss2 <= 14)) {
            tss = ss + " " + secondText[0];
        } else if (ss1 == 1) {
            tss = ss + " " + secondText[1];
        } else {
            tss = ss + " " + secondText[2];
        }

        if (SSS1 == 0 || (SSS1 >= 5 && SSS1 <= 9) || (SSS2 >= 11 && SSS2 <= 14)) {
            tSSS = SSS + " " + millisecondText[0];
        } else if (SSS1 == 1) {
            tSSS = SSS + " " + millisecondText[1];
        } else {
            tSSS = SSS + " " + millisecondText[2];
        }

        message = tHH + " " + tmm + " " + tss + " " + tSSS;

        return message;
    }
}
