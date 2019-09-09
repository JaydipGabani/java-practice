import java.net.*;
import java.awt.*;
import java.awt.event.*;
// import javax.swing.*;
import java.io.*;
import java.net.*;

class server1
{
	
	public static void main(String as[])throws Exception
	{
		String s1;		
		ServerSocket ss=new ServerSocket(12345);
		Socket s=ss.accept();
		//Socket s2=ss.accept();
		DataInputStream doi=new DataInputStream(s.getInputStream());	
		//DataInputStream doi2=new DataInputStream(s2.getInputStream());	
		BufferedReader br=new BufferedReader(new InputStreamReader(doi));
		//BufferedReader br2=new BufferedReader(new InputStreamReader(doi2));
		while(!(s1=br.readLine()).equals("exit"))
		{
				System.out.println(s1);
				//System.out.println(br2.readLine());
		}
		
	}
}