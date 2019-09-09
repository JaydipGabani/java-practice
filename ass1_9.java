import java.util.Scanner;
abstract class shape
{
	double dim1;
	String color;
	abstract void area();
	void display()
	{
		System.out.println(" Color of the shape is "+color);
	}
}
class triangle extends shape
{
	double dim2,ar;
	triangle(String c,int d1)
	{
		color=c;
		dim1=d1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dimension2  :- ");
		dim2=sc.nextInt();
	}
	void area()
	{
		ar=dim1*dim2*0.5;
		System.out.println("area of triangle is :- "+ar);
		display();
	}
}
class rectangle extends shape
{
	double dim2,ar;
	rectangle(String c,int d1)
	{
		color=c;
		dim1=d1;
		Scanner sc=new Scanner(System.in);
	}
	void area()
	{
		ar=dim1*dim2;
		System.out.println("area of rectangle is :- "+ar);
		display();
	}
}
class circle extends shape
{
	double ar;
	circle(String c,int d1)
	{
		color=c;
		dim1=d1;
	}
	void area()
	{
		ar=dim1*dim1*0.5;
		System.out.println("area of circle is :- "+ar);
		display();
	}
}
class square extends shape
{
	double ar;
	square(String c,int d1)
	{
		color=c;
		dim1=d1;
	}
	void area()
	{
		ar=dim1*dim1;
		System.out.println("area of square is :- "+ar);
		display();
	}
}
class ass1_9
{
	public static void main(String z[])
	{
		int d1;
		String c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dimension1  :- ");
		d1=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the color :- ");
		c=sc.nextLine();
		shape s1;
		circle c2=new circle(c,d1);
		s1=c2;
		s1.area();
		square s2=new square(c,d1);
		s1=s2;
		s1.area();
		triangle t1=new triangle(c,d1);
		s1=t1;
		s1.area();
		rectangle r1=new rectangle(c,d1);
		s1=r1;
		s1.area();
		
	}
}