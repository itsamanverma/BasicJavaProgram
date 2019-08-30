//Write the Java program to define the Method to Convert Decimal to Binary//
import java.util.Scanner;
public class DecimalToBinaryConvert
{
	public static void main(String[] args) 
	{
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the Decimal Number to Convert Into Binary Number");
	   int n = sc.nextInt();
	   String s = decToBin(n);
	         System.out.println(s);
	}
	static String decToBin(int n)
	{
		String bin ="";
		do
		{
			int r = n%2;
			bin = r+ bin;
			n = n/2;
		}while(n!=0);
		return bin; 
	}
}