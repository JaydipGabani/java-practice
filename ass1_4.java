import java.util.Scanner;

class Sales
{
	int sales;
	String name;
	
	void getInfo(Scanner sc)
	{
		System.out.print("Enter Name: ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.print("Enter Sales: ");
		sales=sc.nextInt();
	}
	 void calcCOmmision()
	 {
		 double commision;
		 
		 if(sales>=20000)
			commision=(sales*50)/1000.0; 
		 
		 else
			 commision=(sales*10)/1000.0;
		 
		 System.out.println("\nName: "+name);
		 System.out.println("Sales: "+sales);
		 System.out.println("Commision: "+commision+"\n");
	 }
}

class ass1_4
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.print("How many salesman's data you want to enetr ? ");
		n=sc.nextInt();
		
		Sales sl[]=new Sales[n];
		
		for(int i=0;i<n;i++)
		{
			sl[i]=new Sales();
			sl[i].getInfo(sc);
			sl[i].calcCOmmision();
		}
	}
}