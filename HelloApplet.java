import java.applet.Applet;
import java.awt.Graphics;

public class HelloApplet extends Applet {

   
    @Override


    public void paint(Graphics g) {
        g.drawString("HELLO JAVA", 20, 20);
    }
}
