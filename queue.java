import java.util.*;
class queue
{
	public static void main(String s[])
	{
		int a[],f=-1,r=-1;
		int z;
		Scanner n=new Scanner(System.in);
		z=n.nextInt();
		int b=z;
		a=new int[z];
		do
		{
			System.out.println("1.in    2.de");
			z=n.nextInt();
			switch(z)
			{
				case 1:
					if(r==b-1)
					{
						System.out.println("full");
					}
					else if(r==-1)
					{
						r++;
						f++;
						a[r]=n.nextInt();
					}
					else
					{
						r++;
						a[r]=n.nextInt();
					}
					break;
				case 2:
					if(f==-1)
					{
						System.out.println("empty");
					}
					else if(r==f)
					{
						r=f=-1;
					}
					else
					{
						f++;
					}
					break;
			}
			z=n.nextInt();
		}while(z==1);
		for(;f<=r;f++)
		{
			System.out.print(a[f]+" ");
		}
	}
}
