package lab10;

import java.applet.Applet;
import java.awt.*;

public class Task1 extends Applet {

    public void paint(Graphics g) {

        g.drawRect(50, 50, 150, 100);
        g.drawString("Прямоугольник", 70, 45);

        g.drawOval(250, 50, 100, 100);
        g.drawString("Круг", 270, 45);

        g.drawLine(50, 200, 200, 200);
        g.drawString("Линия", 90, 195);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Task1");
        Task1 applet = new Task1();

        frame.add(applet);
        frame.setSize(400, 300);
        applet.init();
        applet.start();

        frame.setVisible(true);
    }
}