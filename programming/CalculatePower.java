//write the java program to display the method to Calculate the power of number between 1 to n.//
import java.util.Scanner;

class CalculatePower
{
	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in);
	   	System.out.println("Enter the Number for which power to be Calculate");
	   	int n = sc.nextInt();
	   	System.out.println("Enter the Power value");
	   	int r = sc.nextInt();

	   int p = power(n,r);
	   System.out.println("Power of the Number is "+p);
	}

	static int power(int n,int r)
	{
       int pw =1; 
           while(r>0)
         {
         	pw = pw * r;
         	r--;
         }
          return pw;

	}
}