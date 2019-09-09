public class TP implements Runnable
{
	int c=0;
	boolean r=true;
	Thread t;
	TP(int a)
	{
		t=new Thread(this);
		t.setPriority(a);
	}
	public void run()
	{
		while(r)
			c++;
	}
	public void start()
	{
		t.start();
	}
	public void stop()
	{
		r=false;
	}
	public static void main(String as[])
	{
		TP h=new TP(5);
		TP l=new TP(3);
		l.start();
		h.start();
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{}
		l.stop();
		h.stop();
		System.out.println(h.c+"     "+l.c);
	}
}