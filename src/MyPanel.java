import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class MyPanel extends JPanel {
    int x = 25;
    int y = 25;

    boolean XPositive = true;
    boolean YPositive = true;
    Image image;

    public MyPanel() {
        Timer t = new Timer(10, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        t.start();
        try {
            image = ImageIO.read(new File("img.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ChangeCoordinates();
        g.drawImage(image, x, y, null);
    }

    public void ChangeCoordinates() {
        if (x > 50) {
            XPositive = false;
        } else if (x <= 0) {
            XPositive = true;
        }

        if (y > 50) {
            YPositive = false;
        } else if (x <= 0) {
            YPositive = true;
        }

        if (XPositive) {
            x = x + 1;
        } else {
            x = x - 1;
        }

        if (YPositive) {
            y = y + 1;
        } else {
            y = y - 1;
        }
    }
}