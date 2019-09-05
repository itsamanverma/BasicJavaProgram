//write the java program to print fabonacci series of First Nth Number//
import java.util.Scanner;
public class Fabonacci3
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number");
	   int n = sc.nextInt();
       Fabonacci3 fb = new Fabonacci3();
       fb.FirstNthFib(n);
   }
   void FirstNthFib(int n)
   {
	   int f1=0,f2=1,f3; 
	   while(n>0)
	   {
	   	 System.out.print(f1+",");
	   	 f3=f1+f2;
	   	 f1=f2;
	   	 f2=f3;
	   	 n--;
	   }	
	}
} 