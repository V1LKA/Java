package lab10;

import java.applet.Applet;
import java.awt.*;

public class Task2 extends Applet {

    public void paint(Graphics g) {

        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 100, 100);

        g.setColor(Color.BLUE);
        g.drawLine(50, 200, 200, 200);

        g.setColor(Color.ORANGE);
        g.fillRect(250, 150, 100, 50);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Task2");
        Task2 applet = new Task2();

        frame.add(applet);
        frame.setSize(400, 300);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}