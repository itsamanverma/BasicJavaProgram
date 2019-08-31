import java.util.Scanner;
public class DecimalTohexadecimalConvert1
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number To Convert Into Hexa-decimal Base");
	   int dec=sc.nextInt();

	   String s = decToHexa(dec);
	      System.out.println(s);
	}
	static String decToHexa(int dec)
	{
		String hex="";
		do
		{
			int r=dec%16;
			if(r<10)
				hex=r+hex;
			else 
				hex = (char)(r+55)+hex;//when ever to operate lower visibility With Upper Visibility The reuslt Comes With Upper Visibility// 
			dec =dec/16;

		}while(dec!=0);
		return hex;
	}
}