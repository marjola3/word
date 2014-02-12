package program_kolory;

import javax.swing.*;
import java.awt.*;

/**
 * User: Mariola
 * Date: 12.02.14
 */
public class Window extends JFrame {
    public Window() {
        setUpFrame();
        initComponents();
    }

    private void setUpFrame() {
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();

        setSize(defaultToolkit.getScreenSize().width, defaultToolkit.getScreenSize().height);
        setUndecorated(true);

        setLocationRelativeTo(null);
        setTitle("Image");
    }

    private void initComponents() {
        Panel panel = new Panel();
        add(panel);
    }
}
