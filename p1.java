import java.util.*;
class student
{
	int rollno,marks[]=new int[5];
	String name;
	void getinfo()
	{
		Scanner n=new Scanner(System.in);
		name=n.nextLine();
		int r=n.nextInt();
		int m[]=new int[5];
		for(int i=0;i<5;i++)
			m[i]=n.nextInt();
		
		setinfo(r,name,m);
	}
	void setinfo(int r,String dname,int m[])
	{
		rollno=r;
		name=dname;
		for(int i=0;i<5;i++)
			marks[i]=m[i];
	}
	float calCPI()
	{
		int f=0;
		float s=0f;
		for(int i=0;i<5;i++)
		{
			if(marks[i]<35)
			{
				f=1;
				break;
			}
		}
		if(f==0)
		{
			
			for(int i=0;i<5;i++)
				s=s+marks[i];
			System.out.print(name+" "+rollno+" ");
		}
		return s;
	}
	public static void main(String s1[])
	{
		student o=new student();
		o.getinfo();
		float a=o.calCPI();
		System.out.println(a/5);
	}
}