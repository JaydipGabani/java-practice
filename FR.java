import java.io.*;
class FR
{
	public static void main(String as[])throws Exception
	{
		//byte s[]=new byte[10];
		FileReader f=new FileReader("FOD.txt"); 
		BufferedReader br=new BufferedReader(f);
		//s=br.read();
		String s=br.readLine();
		System.out.println(s);
	}
}