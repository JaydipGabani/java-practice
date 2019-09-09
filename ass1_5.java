import java.util.Scanner;

class stack
{
	int stk[]=new int[100];
	int tos;
	
	stack()
	{
		tos=-1;
	}
	
	void push(int d_data)
	{
		stk[++tos]=d_data;
		System.out.println("Your element "+d_data+" successfully inserted");
	}
	
	void pop()
	{
		System.out.println("Your element "+stk[tos--]+" successfully deleted");
	}
	
	void display()
	{
		int temp;
		System.out.println("Your Stack is: ");
		for(temp=tos;temp>0;temp--)
			System.out.print(stk[temp]+" ->");
		
		System.out.print(stk[temp]);
	}
}

class ass1_5
{
	public static void main(String s[])
	{
		int ch,data;
		char c;
		stack st=new stack();
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("This is a program of stack.");
			System.out.println("1. Push Operation");
			System.out.println("2. Pop Operation");
			System.out.println("3. Display");
			System.out.print("Give your choice: ");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1: System.out.println("\nYou selected Push operation");
						System.out.print("Enter Data: ");
						data=sc.nextInt();
						st.push(data);
						break;
					
				case 2: System.out.println("\nYou selected Pop operation");
						st.pop();
						break;
						
				case 3: System.out.println("\nYou selected Display Function");
						st.display();
						break;
					
				default: System.out.println("Wrong Choice!!");
			}
			
			System.out.print("\nDo you want to continue ?(y/n): ");
			sc.nextLine();
			c=sc.next().charAt(0);
		}while(c=='y');
	}
}