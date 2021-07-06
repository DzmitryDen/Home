package homeWork6;

import homeWork6.dto.Person;

import java.util.Random;
import java.util.function.Supplier;


public class PersonRand implements Supplier<Person> {

    private static String symbols = "АБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static String symbols_1 = "1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXUZabcdefghijklmnopqrstuvwxuz";
    static Random random = new Random();

    @Override
    public Person get() {

        StringBuilder nick = new StringBuilder();
        int lengthNick = rnd(20,3); // длина имени от 3 до 20 символов

        for(int i =0; i <= lengthNick; i++){
            nick.append(symbols.charAt(random.nextInt(symbols.length())));
        }

        StringBuilder pass = new StringBuilder();
        int lengthPass = rnd(15,5); // длина пароля от 5 до 15 символов

        for(int i =0; i <= lengthPass; i++){
            pass.append(symbols_1.charAt(random.nextInt(symbols_1.length())));
        }

        return new Person (nick.toString(), pass.toString());
    }

    /**
     * Метод получения псевдослучайного целого числа от min до max (включая max). Подсмотрено на javarush;
     */
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
