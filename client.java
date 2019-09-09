import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

class client extends JFrame implements ActionListener 
{
	JButton jb;
	JTextField t1;
	JTextArea t2;
	String s1;
	PrintStream dos;
	Container c;
	client() throws Exception
	{
		c=getContentPane();
		jb=new JButton("send");
		t1=new JTextField(10);
		t2=new JTextArea(10,20);
		c.setLayout(new FlowLayout());
		c.add(jb);
		c.add(t1);
		c.add(t2);
		//ServerSocket ss=new ServerSocket(1234);
		Socket s=new Socket("127.0.0.1",1234);
		dos=new PrintStream(s.getOutputStream());	
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		jb.addActionListener(this);
		/*while(!br.readLine().equals("exit"))
		{
			s1=s1+br.readLine();
			t2.setText(s1);
		}*/
		t2.setText(br.readLine());
		s1="";
	}
	public void actionPerformed(ActionEvent ae)
	{
		dos.print(t1.getText());
	}
	public static void main(String as[]) throws Exception
	{
		client jf=new client();
		jf.setSize(300,300);
		jf.setVisible(true);
	}
}
class server1
{
	
}
