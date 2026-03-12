package lab8;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphic extends JFrame {

    Graphic(String s) {

        super(s);

        setLayout(null);
        setSize(200,200);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Button sin = new Button("Sin");
        sin.setBounds(20,20,120,30);
        add(sin);

        Button cos = new Button("Cos");
        cos.setBounds(20,70,120,30);
        add(cos);

        Button x2 = new Button("Parabola");
        x2.setBounds(20,120,120,30);
        add(x2);

        sin.addActionListener(e -> new Sinus("Sinus"));

        cos.addActionListener(e -> new Cosinus("Cosinus"));

        x2.addActionListener(e -> new X2("Parabola"));
    }

    public static void main(String[] args) {

        new Graphic("Graph Builder");

    }
}