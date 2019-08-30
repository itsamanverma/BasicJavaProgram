//Write the java Program to Display the Method To check The Perfect Number using the user input.//
import java.util.Scanner;

class CountPerfectNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");

		int no = sc.nextInt();
	    for(int j=1;j<=no;j++)
	  {
	  	if(countPerfect(j))
	  		System.out.println(j);
	  }
		 
	}

	static boolean countPerfect(int n)
	{		
		int sum =0,i= 1;
		 while(i<=n/2)
		 {
		 	if(n%i==0)

		 		sum = sum+i;
		 	      i++;
		 }
		 return n== sum;
	}

}  