class Q
{
	int n;
	boolean val=false;
	synchronized int get()
	{
		while(!val)
		
			try
			{	
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("caught");
			}
		System.out.println("Got :" + n);
		val=false;
		notify();
		return n;
		
	}
	synchronized void put(int n)
	{
		while(val)
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("caught");
			}
		this.n=n;
		val=true;
		System.out.println("Put :"+n);
		notify();
	}
}
class P implements Runnable
{
	Q q;
	P(Q q)
	{
		this.q=q;
		new Thread(this,"p").start();
	}
	public void run()
	{
		int i=0;
		while(true)
			q.put(i++);
	}
}
class C implements Runnable
{
	Q q;
	C(Q q)
	{
		this.q=q;
		new Thread(this,"c").start();
	}
	public void run()
	{
		while(true)
			q.get();
	}
}
class PC 
{
	public static void main(String s[])
	{
		Q q=new Q();
		new P(q);
		new C(q);
	}
}
	

