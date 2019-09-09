import java.util.*;
class pre
{
	public static void main(String as[])
	{
		int f=0,size=4,l=10;
		String s[]=new String[l];
		//String t[]=new String[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			s[i]=sc.nextLine();
		}
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if((j!=i)&&(s[i].startsWith(s[j])))
				{
					System.out.println(s[j]+" :is prefix of "+s[i]);
					if(!(s.contains(s[i].substring(s[j].length))))
					{
						s[size]=s[i].substring(s[j].length);
					}
					size++;
					f=1;
				}
			}
		}
		if(f==1)
			System.out.println("not prefix code");
		if(f==0)
			System.out.println("prefix and UD code");
	}
}