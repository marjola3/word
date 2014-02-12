package program_kolory;

import java.util.Random;

/**
 * User: Mariola
 * Date: 10.02.14
 */
public class ImageUtils {
    public static int[][][] createArray(int x, int y) {
        int[][][] img = new int[x][y][3];

        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < 3; k++) {
                    img[i][j][k] = random.nextInt(256);
                }
            }
        }

        return img;
    }

    public static int howManyGreyPoints(int[][][] img) {
        int licznik = 0;

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                if (img[i][j][0] == img[i][j][1] && img[i][j][1] == img[i][j][2]) {
                    if (img[i][j][0] != 0 && img[i][j][0] != 255) {
                        licznik++;
                    }
                }
            }
        }

        return licznik;
    }

    public static int howManyRedPoints(int[][][] img) {
        int licznik = 0;

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                if (img[i][j][0] == 255 && img[i][j][1] == 0 && img[i][j][2] == 0) {
                    licznik++;
                }
            }
        }
        return licznik;
    }

}
