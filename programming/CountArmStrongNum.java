//WRITE A JAVA PROGRAM TO DEFINR THE METHOD TO CHECK THE NUMBER IS ARMSTRONG NUMBER BETWEEN THE 1 TO N NUMBER//
import java.util.Scanner;

class CountArmStrongNum
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number");
	   int n = sc.nextInt();
	   int count=0, sum=0;
         for(int j=0;j<=n;j++)
	   if(countArmStrong(j))
	   {
	   	System.out.println(j);
	    count++;
	    sum = sum +j;
	    }
	    System.out.println("")
	     
	}

static boolean countArmStrong(int x)
{
	int sum =0,t=x;
	int dc = countDigt(x);
	
      do{
      	int r = x%10;
      	sum = sum + pow(r,dc);
      	x= x/10;
      } while(x!=0);
      return sum == t;
  }
 static int countDigt(int n)
 {
 	int c=0;
 	do{
 		c++;
 		n=n/10;
 	}while(n!=0);
 	return c;
 }

 static int pow(int n,int p)
 {
 	int pw=1;
 	while(p>0)
 	{
 		pw = pw*n;
 		p--;
 	}
 	return pw;
 }
}