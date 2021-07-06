package homeWork6.comporator;

import homeWork6.dto.Animal;

public class AgeNickAnimalComparator extends AgeAnimalComparator{

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
