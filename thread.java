import java.util.*;
import java.*;
class nt implements Runnable()
{
	Thread t;
	Strign s;
	nt(String j)
	{
		t=new Thread(this,j);
		s=j;
	}
}