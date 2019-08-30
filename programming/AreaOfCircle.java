  //write the java program to find out Area of circle and take the User input//
import java.util.Scanner;

class AreaOfCircle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Value Of The Radius oF the circle");
		 double r = sc.nextDouble();

		double Area = 3.14 * r * r;

		System.out.println("Area Of  The Circle is "+Area);


	}
}