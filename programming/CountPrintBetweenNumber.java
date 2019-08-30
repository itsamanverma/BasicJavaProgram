//WRITE A JAVA PROGRAM TO PRINT THE PRIME BETWEEN TWO NUMBER//
import java.util.Scanner;

class CountPrintBetweenNumber
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter How many prime Number your want");
	  int n = sc.nextInt();
    int m = sc.nextInt();
    
	  int pm = printPrime(m,n);
       
       System.out.println(n+" th term prime number is: "+pm);

	}

    static int printPrime(int m,int n)
     {
      int count=0;
      if(m>n)
      {
        m=m+n;
        n=m-n;
        m=m-n;
      }
         while(m<=n)
         {
         	if(isPrime(m))
         	{
         		System.out.println(m+" ");
            count++;
         		m++; 
         	}

         }
         return count;
     }
     
	static boolean isPrime(int x)
	{
		int j=2;
  	while(j<=x/2)
  	{
       if(x%j==0)
       	return false;
       j++;
  	}
     return true;
	}
}