package homeWork7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileRead {

    private String path; // путь к файлу
    private String[]  arr; // массив слов

    public FileRead(String path) {
        this.path = path;
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
        System.out.println("Общее количество слов, используемый в тексте: " + count);
    }


/*    private Map<Integer, String> putMap() {

        Map<Integer, String> map = new HashMap<Integer, String>();

       int num = 0; // номер позиции (ключа)

        for (String str : this.arr) {
            map.put(num, str);
            num++;
        }

        return map;
    }*/


    //
}
