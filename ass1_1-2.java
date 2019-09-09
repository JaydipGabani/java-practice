import java.util.*;

class student
{
	int rollno,status=1;
	double CPI;
	String name;
	int marks[]=new int[5];
	
	void getinfo(Scanner sc)
	{
		int temp[]=new int[5];
		int flag=1;
		sc.nextLine();
		System.out.print("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter marks: ");
		for(int i=0;i<5;i++)
		{
			temp[i]=sc.nextInt();
			
			if(temp[i]<0||temp[i]>100)
			{
				System.out.println("Invalid marks!!");
				flag=0;
				break;
			}
			if(temp[i]<35)
				status=0;
		}
			
		if(flag==1)
			setinfo(temp);
	}
	
	void setinfo(int temp[])
	{
		for(int i=0;i<5;i++)
			marks[i]=temp[i];
		
		calCPI(marks);
	}
	
	void calCPI(int marks[])
	{
		int sum=0;
		if(status==0)
			System.out.println("You've failed in this examination");
		
		else
		{
			for(int i=0;i<5;i++)
				sum+=marks[i];

			CPI=sum/5.0;
			
			System.out.println("CPI: "+CPI);
		}
	}
}

class ass1_1
{
	public static void main(String s[])
	{
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("How many student's data you want to enetr ? ");
		n=sc.nextInt();
		
		student st[]=new student[n];
		
		for(int i=0;i<n;i++)
		{
			st[i]=new student();
			st[i].getinfo(sc);
		}
	}
}