package lab10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task10 extends Applet implements ActionListener {

    TextField textField;
    Button button;
    String text = "";
    Color color = Color.BLUE;

    public void init() {

        textField = new TextField(20);
        button = new Button("OK");

        add(textField);
        add(button);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        text = textField.getText();

        // меняем цвет каждый раз
        if (color == Color.BLUE) color = Color.RED;
        else color = Color.GREEN;

        repaint();
    }

    public void paint(Graphics g) {

        g.setColor(color);
        g.fillRect(150, 120, 100, 100);

        g.setColor(Color.BLACK);
        g.drawString(text, 50, 100);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Task10");
        Task10 applet = new Task10();

        frame.add(applet);
        frame.setSize(400, 300);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}
