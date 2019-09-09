import java.util.*;
class Rand
{
	public static void main(String s[])
	{
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
		int c=r.nextInt(50);
		System.out.print(c+ " ");
		}
	}
}