package homeWork6;

import homeWork6.dto.Animal;

import java.util.Random;
import java.util.function.Supplier;

public class AnimalRand implements Supplier<Animal> {

    private static String symbols = "АБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    static Random random = new Random();

    @Override
    public Animal get() {

        StringBuilder nick = new StringBuilder();
        int lengthNick = rnd(20,3); // длина имени от 3 до 20 символов

        for(int i =0; i <= lengthNick; i++){
            nick.append(symbols.charAt(random.nextInt(symbols.length())));
        }

        int age = rnd(1, 100); // возраст он 1 до 100
        return new Animal (age, nick.toString());
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
