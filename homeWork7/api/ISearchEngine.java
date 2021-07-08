package homeWork7.api;

public interface ISearchEngine {

    /**
     * @param text текст в котором осуществляется поиск
     * @param word значение (слово) которое ищется в тексте
     * метод возвращает информацию о количестве раз, которое слово встречается в тексте
     */
    long search(String text, String word);
}
