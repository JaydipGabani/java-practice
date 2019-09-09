import java.util.*;

class Car
{
	int modelno;
	String name,color;
	
	void getCarDetails(Scanner sc)
	{
		System.out.print("Enter Model No.: ");
		modelno=sc.nextInt();
		
		System.out.print("Enter Car Name: ");
		sc.nextLine();
		name=sc.nextLine();
		//sc.nextLine();
		System.out.print("Enter Color: ");
		color=sc.nextLine();
	}
	
	void showCarDetails()
	{
		System.out.println("\nCar's Model No.: "+modelno);
		System.out.println("Car's name: "+name);
		System.out.println("Car's color: "+color+"\n");
	}
}

class ass1_2
{
	public static void main(String s[])
	{
		Car c[]=new Car[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			c[i]=new Car();
			c[i].getCarDetails(sc);
			c[i].showCarDetails();
		}
		
	}
}