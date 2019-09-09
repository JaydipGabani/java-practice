import java.applet.*;
import java.awt.*;

/*<applet code="prac" width=300 height=300> </applet>*/

public class prac extends Applet implements Runnable
{
	int x=0,y=150,a=250,i=0,f=0;
	Thread t;
	public void init()
	{
		t=new Thread(this,"1");
		t.start();
	}
	public void run()
	{
		for(;x<250;)
		{
		try
		{
			if(x==249)
			{
				a=x+1;
				x=0;
			}
			x++;
			a--;
			repaint();
			Thread.sleep(10);
			i++;
			if(i==600)
			{
				f=1;
				setVisible(false);
			}
			//if(f==1)
				//break;
		}
		catch(Exception e){}
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawOval(x,y,50,50);
		g.drawOval(a,y,50,50);
	}
}