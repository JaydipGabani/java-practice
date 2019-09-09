import java.util.Scanner;

class queue
{
	int q[]=new int[100];
	int front,rear;
	
	queue()
	{
		front=rear=-1;
	}
	
	void insert(int d_data)
	{
		if(rear==99)
			System.out.println("Queue Full!!");
		
		else 
		{
			if(front ==-1)
				front++;
			
			q[++rear]=d_data;
			System.out.println("Your data "+d_data+" is successfully inserted");
		}
	}
	
	void delete()
	{
		if(front>rear||front==-1)
			System.out.println("Queue is empty!!");
		
		else
			System.out.println(q[front++]+"is deleted");
	}
	
	void display()
	{
		int temp=front;
		
		if(front==-1||front>rear)
			System.out.println("Queu is empty!!");
		
		else
		{
			System.out.println("Your Queue is: ");
			for(temp=front;temp<rear;temp++)
				System.out.print(q[temp]+"->");
		
			System.out.print(q[temp]);
		}
		
	}
}

class ass1_8
{
	public static void main(String s[])
	{
		int ch,data;
		char c;
		
		queue Q=new queue();
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("This is a program of a Queue");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.print("Give your choice: ");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1: System.out.println("\nYou selected insert function");
						System.out.print("Enter Data: ");
						data=sc.nextInt();
						Q.insert(data);
						break;
						
				case 2: System.out.println("\nYou selected delete function");
						Q.delete();
						break;
						
				case 3: System.out.println("\nYou selected display function");
						Q.display();
						break;
						
				default: System.out.println("Wrong Choice!!");
			}
			
			System.out.println("\nDo you want to continue ?(y/n): ");
			sc.nextLine();
			c=sc.next().charAt(0);
		}while(c=='y');
	}
}