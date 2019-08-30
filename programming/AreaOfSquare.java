import java.util.Scanner;
 class AreaOfSquare
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Value of Length");
	  double l=sc.nextDouble();
	  System.out.println("Enter the Value of width");
	  double b=sc.nextDouble();
	  double r=l*b;
	  System.out.println("Area of Rectangle"+r);
	}
}