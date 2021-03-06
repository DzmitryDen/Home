package homeWork6.comporator;

import homeWork6.dto.Animal;

import java.util.Comparator;

public class AgeAnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {

        if(o1 == null && o2 != null) {
            return 1;
        }

        if(o1 != null && o2 == null) {
            return -1;
        }

        if(o1 == null && o2 == null) {
            return 0;
        }

        int age1 = o1.getAge(); // возраст первого животного
        int age2 = o2.getAge(); // возраст второго животного


        return age1 - age2;
    }
}
