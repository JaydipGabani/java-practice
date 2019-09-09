import java.awt.*;
import java.applet.*;
/*<applet code="LY" width=400 height=400> </applet>*/
public class LY extends Applet
{
	public void init()
	{
		setLayout(new GridLayout(0,1));
		add(new Button("hi"));
		setLayout(new GridLayout(2,1));
		add(new Button("helo"));
		add(new Button("helo"));
		add(new Button("helo"));
	}
}
