import java.util.*;
class huff1
{
	public static void main(String as[])
	{
		Scanner o=new Scanner(System.in);
		int a[]=new int[5];
		char c[]=new char[5];
		for(int i=0;i<5;i++)
		{
			a[i]=o.nextInt();
			c[i]=o.nextLine().charAt(1);
		}
		for(int i=0;i<5;i++)
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
					char f=c[i];
					c[i]=c[j];
					c[j]=f;
				}
			}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+" "+c[i]);
		}
	}
}
