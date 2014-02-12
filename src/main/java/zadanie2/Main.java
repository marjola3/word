package zadanie2;

import java.io.FileNotFoundException;

/**
 * User: Mariola
 * Date: 10.02.14
 */
public class Main {
    public static void main(String[] args) {
        try {
            Word word = new Word();

            int howManyWords = word.howManyWordsStartsWith("Mar");
            int howManyChars = word.howManyCharsInArray();

            System.out.println("howManyWords = " + howManyWords);
            System.out.println("howManyChars = " + howManyChars);
        } catch (FileNotFoundException e) {
            System.out.println("Nie można odczytać pliku: " + e);
        }
    }
}
