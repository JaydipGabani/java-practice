class T1 extends Thread
{
	public static void main(String a[])
	{
		Thread t=Thread.currentThread();
		t.setName("hi");
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(100);
			}
		}
		catch(Exception e){}
		System.out.println(t);
	}
}