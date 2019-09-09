class NT extends Thread
{
	Thread t;
	NT()
	{
		super("1");
		start();
	}
	public void run()
	{
		try{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			Thread.sleep(200);
		}
		}catch(Exception e){}
	}
}
class T2
{
	public static void main(String a[])
	{
		new NT();
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(100);
			}
		}
		catch(Exception e){}
		//System.out.println(t);
	}
}