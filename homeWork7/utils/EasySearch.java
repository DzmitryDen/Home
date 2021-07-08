package homeWork7.utils;

import homeWork7.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {

        int number = 0; // номер позиции
        int result = 0;

        number = text.indexOf(word, number);
        return 0;
    }
}
