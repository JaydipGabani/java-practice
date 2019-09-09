class node
{
	node next;
	int a;
	node(int da)
	{
		a=da;
		next=null;
	}
	void append(node nn)
	{
		node t=this;
		while(t.next!=null)
			t=t.next;
		t.next=nn;
	}
	void display()
	{
		node t=this;
		while(t.next!=null)
		{
			System.out.print(t.a+" ");
			t=t.next;
		}
	}
	
	public static void main(String s[])
	{
		node o[]=new node[15];
		for(int i=0;i<15;i++)
		{
			o[i]=new node(i);
		}
		for(int i=1;i<14;i++)
		{
			o[0].append(o[i+1]);
		}
		o[0].display();
	}
}