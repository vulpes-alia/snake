import java.applet.Applet;
import java.awt.*;

/**
 * Created by Алексей on 12.03.2016.
 */
public class snake extends Applet {

    public void main(String[] args)
    {

        this.paint( getGraphics() );

    }

    public void paint( Graphics draw ){

        draw.drawRect( 100, 100, 10, 10 );
        draw.drawOval( 110, 100, 10, 10 );
        draw.drawOval( 120, 100, 10, 10 );
        draw.drawOval( 130, 100, 10, 10 );

    }
}
