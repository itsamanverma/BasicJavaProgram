//write a java program to define the method to number of prime number between 1 to n//
import java.util.Scanner;

 public class CountPrimeNum
{
   public static void main(String[] args) 
   {
   	  Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter the number betwen the 1 to N");
   	  int n = sc.nextInt();
   	  int rs = CountPrime(n);
   }

  static int CountPrime(int n)
  {
  	 int i=2,num =0;
     for(i=2;i<=n;i++)
     {
        int counter =0;
        
        for( num=i;num>=1;num--)
        {
          if(i%num==0)
          {
            counter = counter+1;
          }
        }
        if(counter==2)
        {
          System.out.println(i+" ");
        }
     }
    return num;
  }
} 