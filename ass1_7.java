import java.util.Scanner;

class matrix
{
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	
	void getInfo(Scanner sc)
	{
		System.out.println("Enter matrix a: ");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j]=sc.nextInt();
				
		System.out.println("Enter matrix b: ");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				b[i][j]=sc.nextInt();
	}
	
	void multiply()
	{
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				for(int k=0;k<3;k++)
					c[i][j]+=a[i][k]*b[k][j];
	}
	
	void display()
	{
		System.out.println("Matrix after multplication is: ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(c[i][j]+" ");
				
			System.out.println();
		}
	}
}

class ass1_7
{
	public static void main(String s[])
	{
		matrix m=new matrix();
		Scanner sc=new Scanner(System.in);
		
		m.getInfo(sc);
		m.multiply();
		m.display();
	}
}
		
					