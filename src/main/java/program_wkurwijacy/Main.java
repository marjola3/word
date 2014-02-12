package program_wkurwijacy;

import javax.swing.*;
import java.awt.*;

/**
 * User: Mariola
 * Date: 10.02.14
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Window window = new Window();
                window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                window.setVisible(true);
            }
        });
    }
}
