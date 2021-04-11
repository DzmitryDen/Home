package HomeWork2.loops;

/** 1.5. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке
 * https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
 * */

public class MultiTab {

    public static void main(String[] args) {

        System.out.println("ТАБЛИЦА\n" + "УМНОЖЕНИЯ");

        MulTab();

        System.out.println("ЭТО\n" + "НУЖНО\n" + "ЗНАТЬ!");
    }

    public static void MulTab () {

        for (int i = 1; i <= 10 ; i++) {

            for (int j = 2; j <= 5 ; j++) {
                int res = i * j;

                if (res < 10) {
                    System.out.print(j + " x " + i + " =  " + res + "  |  ");
                }
                else if (i == 10) {
                    System.out.print(j + " x " + i + "= " + res + "  |  ");
                } else
                    System.out.print(j + " x " + i + " = " + res + "  |  ");

                if (j == 5) {
                    System.out.println();
                }
            }
        }

        for (int i = 0; i < 58; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 1; i <= 10 ; i++) {

            for (int j = 6; j <= 9 ; j++) {
                int res = i * j;

                if (res < 10) {
                    System.out.print(j + " x " + i + " =  " + res + "  |  ");
                }
                else if (i == 10) {
                    System.out.print(j + " x " + i + "= " + res + "  |  ");
                } else
                    System.out.print(j + " x " + i + " = " + res + "  |  ");

                if (j == 9) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
