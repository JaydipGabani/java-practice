import java.util.Scanner;

class Node
{
	int node[]=new int[100];
	int last,start;
	
	Node()
	{
		last=start=0;
	}
	
	void append(int d_data)
	{
		node[last++]=d_data;
		System.out.println("Your node "+d_data+" is successfully appended");
	}
	
	void insert(int pos,int d_data)
	{
		int i;
		for(i=start;i<=last;i++)
		{
			if(node[i]==pos)
			{
				int temp[]=new int[100];
				for(int j=0;j<=i;j++)
					temp[j]=node[j];
				
				temp[i+1]=d_data;
				
				for(int j=i+1;j<=last;j++)
					temp[j+1]=node[j];
				
				node=temp;
				System.out.println("Your node "+d_data+" is successfully inserted");
				break;
			}
			
		}
		if(i==last+1)
		{
			System.out.println("Your given position not found!!");
			System.out.println("Your node "+d_data+" is appended at the end of the list");
		}
		last++;
	}
	
	void delete(int d_data)
	{
		int i;
		for(i=start;i<=last;i++)
		{
			if(node[i]==d_data)
			{
				System.out.println("Your node "+d_data+" is successfully deleted");
				for(i=i;i<last;i++)
					node[i]=node[i+1];
				break;
			}
		}
		
		if(i==last+1)
			System.out.println("There is no such node to delete!!");
		
		else
			last--;
	}
	
	void search(int d_data)
	{
		int i;
		for(i=start;i<=last;i++)
		{
			if(node[i]==d_data)
			{
				System.out.println("Your node "+d_data+" is found");
				break;
			}
		}
		
		if(i==last+1)
			System.out.println("There is no such node in the list!!");
	}
	
	void display()
	{
		int i;
		System.out.print("\nYour linked list is:");
		for(i=start;i<last-1;i++)
			System.out.print(node[i]+"->");
		
		System.out.print(node[i]);
	}
}

class ass1_6
{
	public static void main(String s[])
	{
		int ch,data,pos;
		char c;
		Node n=new Node();
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("This is a program of Linked list.");
			System.out.println("1. Append Operation");
			System.out.println("2. Insert Operation");
			System.out.println("3. Delete Operation");
			System.out.println("4. Search Operation");
			System.out.println("5. Display");
			System.out.print("Give your choice: ");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1: System.out.println("\nYou selected Append operation");
						System.out.print("Enter Data: ");
						data=sc.nextInt();
						n.append(data);
						break;
					
				case 2: System.out.println("\nYou selected Insert operation");
						System.out.print("Enter Data after which you want to insert: ");
						pos=sc.nextInt();
						System.out.print("Enter Data: ");
						data=sc.nextInt();
						n.insert(pos,data);
						break;
						
				case 3: System.out.println("\nYou selected Delete Operation");
						System.out.print("Which node you want to delete ? ");
						data=sc.nextInt();
						n.delete(data);
						break;
				
				case 4:	System.out.println("You selected search operation");
						System.out.print("Which element you want to search ?");
						data=sc.nextInt();
						n.search(data);
						break;
						
				case 5: System.out.println("You selected Display function");
						n.display();
						break;
						
				default: System.out.println("Wrong Choice!!");
			}
			
			System.out.print("\nDo you want to continue ?(y/n): ");
			sc.nextLine();
			c=sc.next().charAt(0);
		}while(c=='y');
	}
}