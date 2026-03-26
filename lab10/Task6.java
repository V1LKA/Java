package lab10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task6 extends Applet implements ActionListener {

    TextField textField;
    Button button;
    String name = "";

    public void init() {
        textField = new TextField(20);
        button = new Button("OK");

        add(textField);
        add(button);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        name = textField.getText();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Привет, " + name, 50, 100);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Task6");
        Task6 applet = new Task6();

        frame.add(applet);
        frame.setSize(400, 300);
        applet.init();
        applet.start();

        frame.setVisible(true);
    }
}