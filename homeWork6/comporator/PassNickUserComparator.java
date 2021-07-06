package homeWork6.comporator;

import homeWork6.dto.Person;

public class PassNickUserComparator extends PassUserComparator{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
