package program_wkurwijacy;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * User: Mariola
 * Date: 12.02.14
 */
public class Panel extends JPanel {
    public Panel() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    repaint();
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Random random = new Random();

        int r = random.nextInt(256);
        int gg = random.nextInt(256);
        int b = random.nextInt(256);

        setBackground(new Color(r, gg, b));
    }
}
