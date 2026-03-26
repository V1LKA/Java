package lab10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task9 extends Applet {

    int x = 0, y = 0;

    public void init() {

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        g.fillOval(x, y, 10, 10);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Task9");
        Task9 applet = new Task9();

        frame.add(applet);
        frame.setSize(400, 300);
        applet.init();
        applet.start();

        frame.setVisible(true);
    }
}
