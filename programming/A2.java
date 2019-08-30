//Write the Java Program to print the Sum of the number to Follow the Conditions
//1.the Number Which is Divisible by 21 ,multiple the number By 4 and give sum.
//2.the Number which is Divisible by 7 ,multiple the number by 3 and give Sum.
//3.the Number which is Divisible by 3 ,multiple the number by 2 and give Sum.
import java.util.Scanner;
public class A2
{
	static int sum=0;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array")
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Read the Elements Of Array");
		     for(int i =0 ;i<arr.length;i++)
		    {
			    arr[i]=sc.nextInt();
		    }
		System.out.println("Enter the Elements of Array");
		    for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+"  ");
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%21==0)
				{
                   sum=sum+multi(a[i],4);
				}
			}
			System.out.println("Sum of the Number Which is Divisible by 21:"+sum);
			sum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%7==0)
				{
                   sum=sum+multi(a[i],3);
				}
			}
			System.out.println("Sum of the Number Which is Divisible by 7:"+sum);
			sum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%3==0)
				{
                   sum=sum+multi(a[i],2);
				}
			}
			System.out.println("Sum of the Number Which is Divisible by 3:"+sum);
	}
	static int multi(int arr[i],int n)
	{
		for(int i =0;i<arr.length;i++)
		{
			if(i<0 && i>arr.length)
			{
				System.out.println("multiplication is Not Possible");
			}
			int m=1; 
			while(arr[i]%21==0||arr[i]%7==0||arr[i]%3==0)
			{
              m=arr[i]*n;
			}
			return m;
		}
	}
}