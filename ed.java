class me extends Exception
{
	int d;
	me(int a)
	{
		d=a;
	}
	me()
	{
		d=0;
	}
	public String toString()
	{
		return (""+d);
	}
}
class ed 
{
	static void compute(int a) throws me
	{
			if(a<10)
				throw new me();
			else
				throw new me(a);
		
	}
	public static void main(String as[])
	{
		try
		{
			compute(1);
			compute(11);
		}
		catch(me e)
		{
			System.out.println(e);
		}
		try
		{
			//compute(1);
			compute(11);
		}
		catch(me e)
		{
			System.out.println(e);
		}
	}
}