import java.awt.*;
import java.applet.*;

/*<applet code="dot" width=300 height=300></applet>*/

public class dot extends Applet
{
	public void init()
	{}
	public void paint(Graphics g)
	{
		g.drawRect(100,100,1,1);
	}
}