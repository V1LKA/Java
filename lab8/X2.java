package lab8;


import java.awt.*;

public class X2 extends Frame {

    X2(String s){

        super(s);

        setSize(400,300);
        setVisible(true);

    }

    public void paint(Graphics g){

        g.drawLine(0,150,400,150);
        g.drawLine(200,0,200,300);

        for(int x=-100;x<=100;x++){

            int y=(x*x)/20;

            g.fillOval(200+x,150-y,2,2);

        }

    }

}