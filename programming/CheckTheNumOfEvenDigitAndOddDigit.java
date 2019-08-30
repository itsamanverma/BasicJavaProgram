	 	}
//write the java program to //
import java.util.Scanner;

class  CheckTheNumOfEvenDigitAndOddDigit
{
	public static void main(String[] args) 
	{
	  SCanner sc = new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n = sc.nextInt();

	  int m = isEvenOrOdd(n);
	}

	static int isEvenOrOdd(int n)
	{
	 int num=0,ecount1=0,ocount2=0;
	 while(n!=0)
	 	{
	 		int r = n%10;
	 		if(r%2==0)
	 			ecount1++;
	 		else
	 			ocount2++;
	 	num= r;
	 	n= n/10;

	 	}
	 	System.out.println("Digit is even number"+ecount1);
	 	System.out.println("Digit is odd number"+ocount2);
	}


}