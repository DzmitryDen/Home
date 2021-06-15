package HomeWork5;

import HomeWork5.Container.DataContainer;

public class ContainerMain {

    public static void main(String[] args) {

        Integer[] arr = {5, 6, null, null};

        DataContainer<Integer> container = new DataContainer<>(arr);

        System.out.println("Номер позиции вставки: " + container.add(777));

        System.out.print("Элементы массива: ");
        for (int i = 0; i < container.getData().length; i++) {
            System.out.print(container.getData()[i] + " ");
        }
    }
}
