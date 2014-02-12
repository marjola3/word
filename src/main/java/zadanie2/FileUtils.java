package zadanie2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * User: Mariola
 * Date: 10.02.14
 */
public class FileUtils {

    public static String[] words() throws FileNotFoundException{
        List<String> wordsList = new ArrayList<String>();

        File file = new File("words.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            wordsList.add(scanner.nextLine());
        }

        String[] words = new String[wordsList.size()];

        Iterator<String> iterator = wordsList.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            words[i] = iterator.next();
            i++;
        }

        return words;
    }
}
