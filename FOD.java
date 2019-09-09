import java.io.*;
class FOD
{
	public static void main(String as[])throws Exception
	{
		byte s[]=new byte[10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//s=br.read();
		System.in.read(s);
		FileOutputStream f=new FileOutputStream("FOD.txt");
		f.write(s,0,s.length);
	}
}