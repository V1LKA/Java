package lab10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task4 extends Applet implements ActionListener {

    Button button;
    String message = "";

    public void init() {
        button = new Button("Нажми меня");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Кнопка нажата!";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Task4");
        Task4 applet = new Task4();

        frame.add(applet);
        frame.setSize(400, 300);
        applet.init();
        applet.start();

        frame.setVisible(true);
    }
}
