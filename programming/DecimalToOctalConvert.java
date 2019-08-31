//Write the Java Program to display the Method To Convert the Decimal Number To Octal Number..//
import java.util.Scanner;
public class DecimalToOctalConvert
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Decimal Number To Convert Into Octal ");
	   int dec = sc.nextInt();
	   String s = decToOct(dec);
	          System.out.println(s);
	}
	static String decToOct(int dec)
	{
		String oct="";
		do
		{
			int r = dec%8;
			oct = r+ oct;
			dec = dec/8;
		}while(dec!=0);
		return oct;
	}
}