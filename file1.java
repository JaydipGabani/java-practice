import java.io.*;
import java.util.*;

class file1
{
	public static void main(String as[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		//BufferedWriter bw=new BufferedWriter(new PrintStream(System.out));
		PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
		//bw.println((String)s);
		pw.println(s);
	}
}