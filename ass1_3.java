import java.util.Scanner;

class Time
{
	int hour,min,sec;
	
	Time(int d_hour,int d_min,int d_sec)
	{
		hour=d_hour;
		min=d_min;
		sec=d_sec;
	}
	
	Time()
	{
		hour=0;
		min=0;
		sec=0;
	}
	
	void sum(Time t1,Time t2)
	{
		int temp;
		sec=t1.sec+t2.sec;
		temp=sec/60;
		sec%=60;
		min=t1.min+t2.min+temp;
		temp=min/60;
		min%=60;
		hour=t1.hour=t2.hour+temp;
		System.out.println("Sum of time of object 1 and object 2 is: ");
	}
	
	void showTime()
	{
		System.out.println("Time is: "+hour+" : "+min+" : "+sec);
	}
}

class ass1_3
{
	public static void main(String s[])
	{
		int hour,min,sec;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Time for object 1: ");
		System.out.print("Enter Hour: ");
		hour=sc.nextInt();
		System.out.print("Enter Min: ");
		min=sc.nextInt();
		System.out.print("Enter Sec: ");
		sec=sc.nextInt();
		
		Time t1=new Time(hour,min,sec);
		t1.showTime();
		
		System.out.println("Enter Time for object 2: ");
		System.out.print("Enter Hour: ");
		hour=sc.nextInt();
		System.out.print("Enter Min: ");
		min=sc.nextInt();
		System.out.print("Enter Sec: ");
		sec=sc.nextInt();
		Time t2=new Time(hour,min,sec);
		t2.showTime();
		
		Time t3=new Time();
		t3.sum(t1,t2);
		t3.showTime();
	}
}