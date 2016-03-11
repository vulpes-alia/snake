import java.applet.Applet;
import java.awt.*;

public class main extends Applet
{
    public void main(String[] args)   throws Exception
    {

        this.paint(getGraphics());

    }

    public void paint(Graphics g){

        g.fillOval(100, 100, 10, 10);
        g.fillOval(100, 110, 10, 10);
        g.fillOval(100, 120, 10, 10);

    }
}