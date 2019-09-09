import java.util.*;
class huff
{
	public int a;
	public char c;
	public String s;
	huff(int f,String k)
	{
		a=f;
		c=k.charAt(1);
	}
	public static void main(String as[])
	{
		Scanner o=new Scanner(System.in);
		huff d[]=new huff[5];
		for(int i=0;i<5;i++)
		{
			d[i]=new huff(o.nextInt(),o.nextLine());
		}
		for(int i=0;i<5;i++)
			for(int j=i+1;j<5;j++)
			{
				if(d[i].a>d[j].a)
				{
					int t=d[i].a;
					d[i].a=d[j].a;
					d[j].a=t;
					char f=d[i].c;
					d[i].c=d[j].c;
					d[j].c=f;
				}
			}
		System.out.println();
		System.out.println();
		for(int i=0;i<5;i++)
		{
			System.out.println(d[i].a+" "+d[i].c);
		}
		System.out.println();
		System.out.println();
		d[0].s="0";
		d[1].s="1";
		d[1].a=d[1].a+d[0].a;
		if(d[2].a>=d[1].a)
		{
			d[2].a+=d[1].a;
			d[0].s="00";
			d[1].s="01";
			d[2].
		}
		else
		{
			if(d[3].a>=d[1].a)
		}
	}
}
