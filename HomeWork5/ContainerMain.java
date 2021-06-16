package HomeWork5;

import HomeWork5.Container.DataContainer;

public class ContainerMain {

    public static void main(String[] args) {

        Integer[] arr = {null};

        DataContainer<Integer> container = new DataContainer<>(arr);

        System.out.println("Номер позиции вставки: " + container.add(777));

        System.out.println("Значение: " + container.get(1));

        System.out.print("Элементы массива: ");
        for (int i = 0; i < container.getItems().length; i++) {
            System.out.print(container.getItems()[i] + " ");
        }
    }
}
