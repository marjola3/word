package zadanie2;

import java.io.FileNotFoundException;

/**
 * User: Mariola
 * Date: 10.02.14
 */
public class Word {

    private String[] words;

    public Word() throws FileNotFoundException {
        words = FileUtils.words();
    }

    public int howManyWordsStartsWith(String starts) {
        if (words == null) return -1;

        int licznik = 0;

        for(int i = 0; i < words.length; i++){
            if (words[i].startsWith(starts)) {
                licznik++;
            }
        }

        return licznik;
    }

    public int howManyCharsInArray() {
        if (words == null) return -1;

        int suma = 0;

        for (int i = 0; i < words.length; i++) {
            suma += words[i].length();
        }
        return suma;
    }
}

