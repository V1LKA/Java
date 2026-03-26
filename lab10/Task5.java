package lab10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task5 extends Applet implements ActionListener {

    Button button;
    int count = 0;

    public void init() {
        button = new Button("Нажми");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Количество нажатий: " + count, 50, 100);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Task5");
        Task5 applet = new Task5();

        frame.add(applet);
        frame.setSize(400, 300);
        applet.init();
        applet.start();

        frame.setVisible(true);
    }
}