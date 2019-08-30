////
import java.util.Scanner;

class CountSettedBits
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number to Count the Setted bits");
	    int n = sc.nextInt();

	    int c1 = coutSettedBit(int n);
	    {
	    	System.out.println(c1);
	    }	
	}

	static int coutSettedBit(int x)
	{
		int count=0;
		do{
			if(x%2==1)
			{
				count++;
				n=n/2;
			}while(x!=0);
			 return count;

		}
	}
}