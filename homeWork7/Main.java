package homeWork7;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileRead fileRead = new FileRead("D:\\jd1\\projects\\JD1\\HomeWork\\src\\Война и мир_книга.txt");
        fileRead.printUnCountWords();
        fileRead.printCountWords();

    }
}
