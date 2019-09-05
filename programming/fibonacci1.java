import java.util.Scanner;

class Fibonacci1//check the First N th Fibonacci Number//
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
	int f1=0,f2=1,f3;
	while(n>0)
	   {
		System.out.println(f1);
		f3=f1+f2;
		f1=f2;
		f2=f3;
		n--;
	   } 
  } 
}