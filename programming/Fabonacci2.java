//Write the Fibonacci Number within The Number//
import java.util.Scanner;
	class Fabonacci2
	{
		public static void main(String[] args)
		{
		   Scanner sc = new Scanner(System.in);
           System.out.println("Enter the Number");
           int n = sc.nextInt();
           Fabonacci2 fb = new Fabonacci2();
           fb.withinNthFib(n);

	    }
	    void withinNthFib(int n)
	    {
	    	int f1=0,f2=1,f3;
	    	while(f1<=n)
	    	{   System.out.println(f1);
	    		f3=f1+f2;
	    		f1=f2;
	    		f2=f3; 
	    		 
	    	}    n--;
	    }   
    }