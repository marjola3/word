package program_kolory;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * User: Mariola
 * Date: 12.02.14
 */
public class Panel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int[][][] img = ImageUtils.createArray(getWidth(), getHeight());

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                int red = img[i][j][0];
                int green = img[i][j][1];
                int blue = img[i][j][2];

                Color color = new Color(red, green, blue);
                g.setColor(color);
                g.drawLine(i, j, i, j);
            }
        }

    }
}
