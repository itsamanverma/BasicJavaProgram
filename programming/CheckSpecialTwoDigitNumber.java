//Write the java Program to define the method to Checked the number is the Spiceal Two Digit number or not?//
import java.util.Scanner;

 public class CheckSpecialTwoDigitNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		boolean r = isSpecialTwoDigit(n);
		if(r)
			System.out.println(n+" isSpecialTwoDigit");
		else
			System.out.println(n+ " isNotSpecialTwoDigit");
	}

	static boolean isSpecialTwoDigit(int n)
	{
		int sum=0,d1=0,d2=0;
		for(int i=0;i<=1;i++)
		    {
             d1=n/10;
             d2=n%10;
            }
             sum = d1+d2+d1*d2;
             if(sum==n)
        	   return true;
             else
        	   return false;
	}

}