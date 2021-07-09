package homeWork7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileRead {

    private String path; // путь к файлу
    private String[]  arr; // массив слов

    public FileRead(String path) throws IOException {
        this.path = path;

        readToStr(path);
        putArr();
    }

    // Читаем файл по заданному пути и возвращаем строку
    private String readToStr (String path) throws IOException {

        Path path1 = Path.of(path);
        String str = Files.readString(path1);
        return str;
    }

    // Записываем слова в массив без знаков препинания
    private String[] putArr() throws IOException{

        String str = readToStr(this.path).replaceAll("\\p{Punct}", "");
        return this.arr = str.split("\\s");
    }

    // Помещаем слова в Set (коллекция уникальных значений)
    private Set<String> putSet() {

        Set<String> set = new HashSet<String>();

        for (String str : this.arr) {
            set.add(str);
        }

        return set;
    }

    // Выводим количество уникальных слов, используемых в тексте
    public void printUnCountWords() {

        int count = putSet().size();
        System.out.println("Уникальный набор слов, используемый в тексте: " + count);
    }


    // Помещаем слова в List
    private List<String> putList() {

        List<String> list = new ArrayList<String>();

        for (String str : this.arr) {
            list.add(str);
        }
        return list;
    }

    // Выводим общее количество слов, используемых в тексте
    public void printCountWords() {

        int count = putList().size();
        System.out.println("Общее количество слов, используемых в тексте: " + count);
    }


    // заполняем коллекцию map - K:слово, V:количество повторений в тексте
    private Map<String, Integer> putMap(){

        List<String> list = putList();
        Map<String, Integer>  map = new HashMap<String, Integer>(); // создаем колекцию map

        boolean check = true;

        while (check) {

            int count = 0; // счетчик одинаковых слов в списке
            String firstWord = list.get(0); // первое слово из списка

            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).equals(firstWord)) {
                    count++; // посчитали количество слов в списке
                }
            }

            map.put(firstWord, count); // добавили в map слово и количество его повторений

            for (int i = 0; i < count; i++) {
                list.remove(firstWord); // удалили из списка все одинаковые слова
            }

            if (list.size() == 0) check = false;
        }

        return map;
    }
}
