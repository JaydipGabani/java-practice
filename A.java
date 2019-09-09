class A implements Runnable
{
	int n=-1;
	int a[]=new int[15];
	Thread t;
	boolean v=false;
	A(String s)
	{
		t=new Thread(this,s);
		t.start();
	}
	public void pop()
	{
		for(;n!=-1;n--)
		{
		if(!v&&n==-1)
		{
			v=true;
			notify();
		}
		if(n==-1)
		{
			try{
			wait();
			}catch(Exception e){System.out.println(e);}	
			notify();
		}
		System.out.println(a[n]);
		}
	}
	public void push(int d)
	{
		for(n=0;n<15;)
		{
		if(v&&n==14)
		{
			v=false;
			notify();
		}
		if(n==14)
		{
			try{
			wait();
			}catch(Exception e){System.out.println(e);}
		}
		n++;
		a[n]=++d;
		System.out.println(a[n]);
		}
	}
	public void dis()
	{
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
	public void run()
	{
		if(Thread.currentThread().getName().equals("SI"))
		{
			this.push(10);
		}
		else
			this.pop();
	}
	public static void main(String s[])
	{
		new A("SD");
		new A("SI");
		//Thread t1=new Thread("SID");
		//t.start();
		//t1.start();
	}
}  