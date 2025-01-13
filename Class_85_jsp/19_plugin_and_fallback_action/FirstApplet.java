import java.applet.Applet;
import java.awt.Graphics;

public abstract class FirstApplet extends Applet{
	
	public void paint(Graphics g){
		g.drawString("hello",50,50);
	}
}