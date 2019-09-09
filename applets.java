import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
/*<applet code="applets" width=300 height=300>
 </applet>*/
public class applets extends Applet implements MouseListener,KeyListener,ActionListener{
	String msg;
		public void init()
		{
			addMouseListener(this);
			addKeyListener(this);
			addActionListener(this);
		}
		public void start()
		{
			msg="fuck";
			setBackground(Color.cyan);
		}
		public void mouseClicked(MouseEvent me)
		{
			msg="clicked";
			repaint();
		}
		public void mousePressed(MouseEvent me)
		{
			msg="press";
			repaint();
		}
		public void mouseReleased(MouseEvent me)
		{
			msg="release";
			repaint();
		}
		public void mouseEntered(MouseEvent me)
		{
			msg="enter";
			repaint();
		}
		public void mouseExited(MouseEvent me)
		{
			//msg="exit";
			//repaint();
		}
		public void keyPressed(KeyEvent ke)
		{
			//msg="kfsdhg";
			repaint();
		}
		public void keyReleased(KeyEvent ke)
		{
			//msg="sasa";
			repaint();
		}
		public void keyTyped(KeyEvent ke)
		{
			msg+=ke.getKeyChar();
			repaint();
		}
		public void paint(Graphics g)
		{
			String msg1;
			URL url=getCodeBase();
			showStatus("hi");
			msg1=url.toString();
			url=getDocumentBase();
			g.drawString(msg,10,20);
			g.drawString(msg1,100,200);
			msg1=url.toString();
			g.drawString(msg1,110,220);
		}
}