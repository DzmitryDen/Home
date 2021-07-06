package homeWork6.comporator;
import homeWork6.dto.Person;
import java.util.Comparator;

public class NickUserComparator implements Comparator<Person> {

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

        String nick1 = o1.getNick();
        String nick2 = o2.getNick();

        return nick1.compareTo(nick2);
    }
}
