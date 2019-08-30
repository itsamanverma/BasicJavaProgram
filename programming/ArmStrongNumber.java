//WRITE A JAVA PROGRAM TO DEFINR THE METHOD TO CHECK THE NUMBER IS ARMSTRONG NUMBER OR NOT//
import java.util.Scanner;

class ArmStrongNumber
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number");
	   int n = sc.nextInt();

	   boolean rs = isArmStrong(n);
	   if(rs)
	   	System.out.println(n+"is the ArmStrongNumber");
	   else 
	   	System.out.println(n+" IS not the ArmStrongNumber");

	}

static boolean isArmStrong(int x)
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