import java.util.*;
import java.io.*;
class file {
public static void main(String s[]) throws Exception
{
	int i=0;
	Scanner r=new Scanner(System.in);
	FileInputStream fin;
	try
	{
		fin=new FileInputStream(s[0]);
		while(i!=-1)
		{
			i=fin.read();
			System.out.print((char )i);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}