package lab8;


import java.awt.*;

public class Sinus extends Frame {

    Sinus(String s){

        super(s);

        setSize(400,300);
        setVisible(true);

    }

    public void paint(Graphics g){

        g.drawLine(0,150,400,150);
        g.drawLine(200,0,200,300);

        for(int i=0;i<360;i++){

            int x=i;
            int y=(int)(80*Math.sin(Math.PI*i/180));

            g.fillOval(200+x/2,150-y,2,2);
        }

    }

}
