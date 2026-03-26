package lab10;

import java.applet.Applet;
import java.awt.*;

public class Task8 extends Applet implements Runnable {

    int x = 0;

    public void init() {
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            x += 5;
            if (x > 300) x = 0;

            repaint();

            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.fillOval(x, 100, 50, 50);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Task8");
        Task8 applet = new Task8();

        frame.add(applet);
        frame.setSize(400, 300);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}