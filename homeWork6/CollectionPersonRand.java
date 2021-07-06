package homeWork6;

import homeWork6.dto.Person;

import java.util.Collection;

public class CollectionPersonRand {

    static PersonRand personRand = new PersonRand();

    public static void addPerson (Collection<Person> collection, int count) {

        for (int i = 0; i < count; i++) {
            collection.add(personRand.get());
        }
    }
}
