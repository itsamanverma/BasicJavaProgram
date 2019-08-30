//Write the java Program to Display the Method To check The Perfect Number using the user input.//
import java.util.Scanner;

class CheckPerfect
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter the Number");

		int no = sc.nextInt();
		boolean r = isPerfect(no);
		{
			if(r)
				System.out.println(no+" is thr perfect Number");
			else
				System.out.println(no+" Is not the Perfect Number");
		}
	}

	static boolean isPerfect(int n)
	{		
		int sum =0,i=1;
		
		 while(i<=n/2)
		 {
		 	if(n%i==0)
               {
		 		sum = sum+i;
		 	   }
		 	   i++;
		 }
	return n==sum;
	}

}  