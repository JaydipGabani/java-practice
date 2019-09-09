import java.util.*;
class demo6{
	public static void main(String sz[])
	{
		int r1,r2,f=0;
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		r1=ob.nextInt();
		r2=ob.nextInt();
		String s;
		int b=0;
		int z=0;
		Scanner ob1=new Scanner(System.in);
		do
		{
			z=0;
			s=ob1.nextLine();
			if(s.charAt(0)=='A')
			{
				for(int i=r1;i<=r2;i++)
				{
					if(i>100)
					{	
						int k=i;
						f=0;
						do
						{
							if(((k%10)+48)==s.charAt(1))
							{
								k=(k/100);
							}
							else
							{
								f=1;
								break;
							}
						}while(k>0);
						if(f==0)
						{
							z++;
						}
					}
				}
				System.out.println(z);
			}
			else if(s.charAt(0)=='C')
			{
				for(int i=r1;i<=r2;i++)
				{
					int k=i;
					int c=0;
					while(k>0)
					{
						if(((k%10)+48)==s.charAt(2))
						{
							c++;
						}
						else
						{
							c=0;
						}
						k=k/10;
						if((c+48)>=s.charAt(1))
						{
							z++;
							break;
						}
					}
				}
				System.out.println(z);
			}
			else if((s.charAt(0)>=48&&s.charAt(0)<=57))
			{
				for(int i=r1;i<=r2;i++)
				{
					int k=i;
					int r=(int)(k/Math.pow(10,(s.length()-1)))+48;
					if(r==s.charAt(0)&&i<=Math.pow(10,(s.length())))
					{
						z++;
					}
					
				}
				System.out.println(z);
			}
			b++;
		}while(b<a);		
	}
}