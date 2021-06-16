package HomeWork5.Container;

import java.util.Arrays;

/**
 * DataContainer c однми дженериком (хранит неограниченное количество объектов обобщенного типа
 */

public class DataContainer <T>{

    // поле (внутренний массив) предназначено для хранения передаваемых объектов
    private T [] data;

    // конструктор
    public DataContainer(T[] data) {
        this.data = data;
    }

    // метод (добавляет данные во внутреннее поле data в позицию null и возвращает номер позиции вставки)
    public int add (T item) {

        int a = -1; // хранит возвращаемое значение

        // при попытке вствки null возвращаем -1
        if(item == null) {
            return a;
        }

/*
        if(this.data.length == 0) {
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
            this.data[0] = item;
            a = 0;
            return a;
        };*/

        // ищем null и заменяем на переданное значение
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                a = i;
                return a;
            }
        }

        this.data = Arrays.copyOf(data, data.length + 1); // новый массив с учетом увеличения на 1 позицию
        int newLength = this.data.length; // длина нового массива
        int j = newLength - 1; // индекс последней позиции
        this.data[j] = item;
        a = j;
        return a;
    }

    // возвращает значение из массива по индексу
    public T get (int index) {
        if (index >= 0 && index <= data.length-1)
        return this.data[index];
        else return null;
    }

    // возвращает массив значений
    public T[] getItems() {
        return this.data;
    }

    // удаляет элемент маассива по индексу
    public boolean delete (int index) {
        if (index >= 0 && index <= data.length-1) {
            return true;
        }

        else return false;
    }

}
