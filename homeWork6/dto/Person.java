package homeWork6.dto;

public class Person {

    // поля класса
    private String nick;
    private String password;

    // конструкто
    public Person(String nick, String password) {
        this.nick = nick;

        if (password.length() <= 10 && password.length() >=5) {
            this.password = password;
        } else {
            System.out.println("Требуемая длина пароля от 5 до 10 символов");
            return;
        }
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }
}

