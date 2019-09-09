import java.applet.*;
import java.awt.*;
/*<applet code="rect" width= 500 height=500></applet>*/
public class rect extends Applet{
	public void init(){
	setForeground(Color.cyan);
	}
	public void start(){}
	public void paint(Graphics g)
	{
		g.fillRoundRect(100,100,100,100,100,100);
		g.fillOval(300,300,60,60);
		g.fillArc(400,400,60,60,199,80);
	}
}
	