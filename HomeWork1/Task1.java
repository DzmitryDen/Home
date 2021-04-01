package HomeWork1;

// Задание 1 - Побитовые операции

public class Task1 {

/*  Задание 1.2 - побитовые операции с числами 42 и 15.
    Задание 1.3 - Для получения вычислений для иных значений (например -42 и -15)
измените соответствующие значения в переменных a и b;
!!! Также изменять значения на соответствующие в коде, в местах, где необходимо вернуть
исходное значение - отмечено комментарием в коде.
    Задание 1.4 - Двоичный код выводится в консоль в результате выполнения программы.
    Задание 1.5 - Побитовые операторы могут быть применены только к целочисленным типам.
Использование дробного числа (например 42.5) недопустимо
*/

    public static void main(String[] args) {

//      Исходные значения
        int a = 42; // 00101010
        int b = 15; // 00001111

        System.out.println("Использование побитовых операций с числами: ");
        System.out.println(a + " двоичный формат: " + Integer.toBinaryString(a) + " и "
                         + b + " двоичный формат: "  + Integer.toBinaryString(b));
        System.out.println();

        Operation(a, b);
    }

    public static void Operation (int a, int b) {

        String res = "Результат: ";

        System.out.println("AND: &");
        int c = a & b; // 00001010
        System.out.println("Выражение: a & b");
        System.out.println(res + c + " двоичный формат: "  + Integer.toBinaryString(c));
        System.out.println();

        System.out.println("AND с присвоением: &=");
        a &= b; // 00001010
        System.out.println("Выражение: a &= b");
        System.out.println(res + a + " двоичный формат: "  + Integer.toBinaryString(a));
        a = 42; // возвращаем исходное значение!
        System.out.println();

        System.out.println("OR: |");
        int d = a | b; // 00101111
        System.out.println("Выражение: a | b");
        System.out.println(res + d + " двоичный формат: "  + Integer.toBinaryString(d));
        System.out.println();

        System.out.println("OR c присваиванием: |=");
        a |= b; // 00101111
        System.out.println("Выражение: a |= b");
        System.out.println(res + a + " двоичный формат: "  + Integer.toBinaryString(a));
        a = 42; // возвращаем исходное значение!
        System.out.println();

        System.out.println("Исключающее (логическое) OR: ^");
        int e = a ^ b; //00100101
        System.out.println("Выражение: a ^ b");
        System.out.println(res + e + " двоичный формат: "  + Integer.toBinaryString(e));
        System.out.println();

        System.out.println("Исключающее (логическое) OR с присваиванием: ^=");
        a ^= b; // 00100101
        System.out.println("Выражение: a ^= b");
        System.out.println(res + a + " двоичный формат: "  + Integer.toBinaryString(a));
        a = 42; // возвращаем исходное значение!
        System.out.println();

        System.out.println("Сдвиг влево: <<");
        int f = a << 2; // 10101000
        int f1 = b << 2; // 00111100
        System.out.println("Выражения: a << 2 и b << 2");
        System.out.println(res + f + " двоичный формат: "  + Integer.toBinaryString(f) + " и "
                + f1 + " двоичный формат: "  + Integer.toBinaryString(f1));
        System.out.println();

        System.out.println("Сдвиг влево с присваиванием: <<=");
        a <<= 2; // 10101000
        b <<= 2; // 00111100
        System.out.println("Выражения: a <<= 2 и b <<= 2");
        System.out.println(res + a + " двоичный формат: "  + Integer.toBinaryString(a) + " и "
                + b + " двоичный формат: "  + Integer.toBinaryString(b));
        a = 42; b = 15; // возвращаем исходные значения!
        System.out.println();

        System.out.println("Сдвиг вправо: >>");
        int g = a >> 2; // 00001010
        int g1 = b >> 2; // 00000011
        System.out.println("Выражения: a >> 2 и b >> 2");
        System.out.println(res + g + " двоичный формат: "  + Integer.toBinaryString(g) + " и "
                + g1 + " двоичный формат: "  + Integer.toBinaryString(g1));
        System.out.println();

        System.out.println("Сдвиг вправо с присваиванием: >>=");
        a >>= 2; // 00001010
        b >>= 2; // 00000011
        System.out.println("Выражения: a >>= 2 и b >>= 2");
        System.out.println(res + a + " двоичный формат: "  + Integer.toBinaryString(a) + " и "
                + b + " двоичный формат: "  + Integer.toBinaryString(b));
        a = 42; b = 15; // возвращаем исходные значения!
        System.out.println();

        System.out.println("Сдвиг вправо с заполнением нулями: >>>");
        int h = a >>> 2; // 00001010
        int h1 = b >>> 2; // 00000011
        System.out.println("Выражения: a >>> 2 и b >>> 2");
        System.out.println(res + h + " двоичный формат: "  + Integer.toBinaryString(h) + " и "
                + h1 + " двоичный формат: "  + Integer.toBinaryString(h1));
        System.out.println();

        System.out.println("Сдвиг вправо с заполнением нулями с присваиванием: >>>=");
        a >>>= 2; // 00001010
        b >>>= 2; // 00000011
        System.out.println("Выражения: a >>>= 2 и b >>>= 2");
        System.out.println(res + a + " двоичный формат: " + Integer.toBinaryString(a) + " и "
                + b + " двоичный формат: "  + Integer.toBinaryString(b));
        a = 42; b = 15; // возвращаем исходные значения!
        System.out.println();

        System.out.println("Унарный NOT: ~");
        int a1 = ~a; //11010101
        int b1 = ~b; // 11110000
        System.out.println("Выражения: ~a и ~b");
        System.out.println(res + a1 + " двоичный формат: "  + Integer.toBinaryString(a1) + " и "
                + b1 + " двоичный формат: "  + Integer.toBinaryString(b1));

    }

}
