import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="fb" width=300 height=300></applet>*/
public class fb extends Applet implements ActionListener,AdjustmentListener,MouseMotionListener 
{
	List os,br;
	String m="";
	Scrollbar a,b;
	public void init()
	{
		os=new List(2,true);
		br=new List(2,false);
		int w=300;
		int h=300;
		a=new Scrollbar(Scrollbar.VERTICAL,0,1,0,h);
		b=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,w);
		os.add("hi");
		os.add("hi");
		os.add("hi");
		os.add("hi");
		os.add("hi");
		br.add("hello");
		br.add("hello");
		br.add("hello");
		br.add("hello");
		br.add("hello");
		add(os);
		add(br);
		add(a);
		add(b);
		os.addActionListener(this);
		br.addActionListener(this);
		addMouseMotionListener(this);
		a.addAdjustmentListener(this);
		b.addAdjustmentListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void mouseMoved(MouseEvent me){}
	public void mouseDragged(MouseEvent me)
	{
		a.setValue(me.getY());
		b.setValue(me.getX());
		repaint();
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		int t=os.getSelectedIndex();
		m=m+os.getItem(t);
		g.drawString(m,100,100);
		m=""+a.getValue()+b.getValue();
		showStatus(m);
	}
}