import java.util.*;
class demo3
{
	public static void main(String[] args) {
		int s[][]=new int[10][3];
	Scanner o=new Scanner(System.in);
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			s[i][j]=o.nextInt();
		}
	}
	for(int i=0;i<2;i++)
	{
			switch(s[i][0])
			{
				case 1:
					System.out.println(s[i][1]+"th january "+s[i][2]);
					break;

				case 2:
					System.out.println(s[i][1]+"th febary"+s[i][2]);
					break;

			}
	}
}
}