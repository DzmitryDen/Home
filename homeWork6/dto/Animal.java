package homeWork6.dto;

public class Animal {

    // поля класса
    private String nick;
    private int age;

    // конструктор
    public Animal(int age, String nick) {
        this.nick = nick;

        if (age <= 15 && age >= 1) {
            this.age = age;
        } else {
            System.out.println("Требуемый возраст от 1 до 15 лет");
        }
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }
}
