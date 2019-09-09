import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Game" width=700 height=600></applet>*/
public class Game extends Applet implements Runnable,KeyListener
{
	public static int i=0;
	Thread t,p,o;
	String n,m,k;
	public void init()
	{	
		setForeground(Color.red);
		addKeyListener(this);
	}
	public void start()
	{
		//o=new Thread(this);
		//o.setName("hihihi");
		//k=o.getName();
		p=new Thread(this);
		p.setName("piller");
		n=p.getName();
	    t=new Thread(this);
		t.setName("bird");
		m=t.getName();
		t.start();
		p.start();
	}
	public void keyPressed(KeyEvent ke)
	{
		repaint(100,100,200,200);
	}
	public void keyReleased(KeyEvent ke){}
	
	public void run()
	{
		if(Thread.currentThread().getName().equals(n))
		{
			showStatus("hi htete");
			try{
				for(int j=0;j<100;j++)
				{	
					
					Thread.sleep(20);
				}
			}
			catch(Exception e)
			{}
		}
		if(Thread.currentThread().getName().equals(m))
		{
			try{
				for(;;)
				{
					showStatus("hi");
					repaint();
					Thread.sleep(20);
				}
			}catch(Exception e)
			{}
		} 
	}
	public void paint(Graphics g)
	{
			i++;
			if(i<500)
			{
				//showStatus("hi");
				g.fillOval(10,i+10,20,20);
				g.drawString(n,100,100);
				g.drawString(m,110,110);
				//this.run();
			}
			else
				g.drawString("over",300,300);
			
	}
	public void keyTyped(KeyEvent ke)
	{
		char =ke.getKeyChar();
		
	}
}