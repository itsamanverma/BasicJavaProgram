import java.util.Scanner;
public class BinaryToDecimalConvert
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number To Convert Into Binary To decimal Number");
	   int bin = sc.nextInt();
	   int dec = binToDec(bin);
	        System.out.println(dec);	
	}
	static int binToDec(int bin)
	{
		int dec=0,count=0;
		do
		{
			int r =bin%10;
			dec = dec + r* pow(2,count);
			bin = bin/10;
			count++;
		}while(bin!=0);
		return dec;
	}
	static int pow( int n,int r)
	{
		int pw=1;
		while(r>0)
		{
			pw=pw*n;
			r--;
		}
		return pw;
	}
}