
abstract class box{
	abstract void add();
	}
class Add extends box{
	void add()
	{
		System.out.println("yes");
	}
public static void main(String s[])
{	
	Add c=new Add();
	c.add();	
}
}