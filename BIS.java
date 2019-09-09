import java.io.*;
class BIS
{
	public static void main(String as[])throws Exception
	{
		byte s[]=new byte[10];
		System.in.read(s);
		BufferedInputStream br=new BufferedInputStream(new ByteArrayInputStream(s));
		int c;
		//s=br.read();
		
		while((c=br.read())!=-1)
			System.out.print((char)c);
	}
}