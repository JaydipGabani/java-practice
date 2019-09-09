import java.io.*;
import java.util.*;

class pro
{
	public static void main(String s1[]) throws Exception
	{
		Properties p=new Properties();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String na,no;
		boolean v=false;
		FileInputStream fin=null; 
		try
		{
			fin=new FileInputStream("Pb1.dat");
		}		
		catch(Exception e){}
		try{
			if(fin!=null)
			{
				p.load(fin);
				fin.close();
			}
		}
		catch(Exception e){}
		do
		{
			na=br.readLine();
			if(na.equals("quit"))
				continue;
			no=br.readLine();
			p.put(na,no);
			v=true;
		}while(!na.equals("quit"));
		if(v)
		{
			FileOutputStream fout=new FileOutputStream("Pb1.dat");
			p.store(fout,"TB");
			fout.close();
		}
		do
		{
			na=br.readLine();
			if(na.equals("quit"))
				continue;
			System.out.println((String)p.get(na));
		}while(!na.equals("quit"));
}
}