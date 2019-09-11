//WRITE A JAVA PROGRAM TO RETURN THE Nth ARMSTRONG NUMBER //
import java.util.Scanner;

class FirstArmStrongNumber
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter How many Amrstrong Number your want");
	  int n = sc.nextInt();

	  for(int i=1;n>0;i++)
	  {
	  if(isArmStrong(i)) 
	   {
	      System.out.println(i+" ");
	      n--;		
	   } 
	  }	
	}

	static boolean isArmStrong(int x)
	{
		int sum=0,t=x;
    	int dc = countdigt(x);
		do
		{
         int r = x%10;
         sum = sum+ pow(r,dc);
         x=x/10;   
		}while(x!=0);
		return sum ==t;
	}

	static int countdigt(int n)
	{
		int c=0;
		do
		{
          c++;
          n=n/10;
		}while(n!=0);
		return c;
	}

	static int pow(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw= pw*n;
			p--;
		}
		return pw;
	}
}