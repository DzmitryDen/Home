package homeWork6.comporator;
import homeWork6.dto.Person;

import java.util.Comparator;

public class PassUserComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        if(o1 == null && o2 != null) {
            return 1;
        }

        if(o1 != null && o2 == null) {
            return -1;
        }

        if(o1 == null && o2 == null) {
            return 0;
        }

        String password1 = o1.getPassword(); // пароль первого пользователя
        String password2 = o2.getPassword(); // пароль второго пользователя

        int lenpass1 = password1.length(); // длина пароля первого пользователя
        int lenpass2 = password2.length(); // длина пароля первого пользователя

        return lenpass1 - lenpass2;
    }
}
