package homeWork6;

import homeWork6.dto.Animal;

import java.util.Collection;

public class CollectionAnimalRand {

    static AnimalRand animalRand = new AnimalRand();

    public static void addAnimal (Collection<Animal> collection, int count) {

        for (int i = 0; i < count; i++) {
            collection.add(animalRand.get());
        }
    }
}
