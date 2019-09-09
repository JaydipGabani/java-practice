import java.net.*;
import java.awt.*;
import java.awt.event.*;
// import javax.swing.*;
import java.io.*;
import java.net.*;

class client1
{
	
	public static void main(String as[])throws Exception
	{
		String s1;
		Socket s=new Socket("127.0.0.1",12345);
		PrintStream dos=new PrintStream(s.getOutputStream());	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(!((s1=br.readLine()).equals("exit")))
		{
				 dos.println(s1);
		}
		
	}
}