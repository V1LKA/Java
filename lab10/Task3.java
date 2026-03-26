package lab10;

import java.applet.Applet;
import java.awt.*;

public class Task3 extends Applet {

    public void paint(Graphics g) {

        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Arial", Font.BOLD, 20));

        g.drawString("Hello Java Applet", 80, 120);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Task3");
        Task3 applet = new Task3();

        frame.add(applet);
        frame.setSize(400, 300);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}
