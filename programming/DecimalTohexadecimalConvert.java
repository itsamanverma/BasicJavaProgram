//write the java program to convert the decimal number into hexa decimal number//
import java.util.Scanner;
public class DecimalTohexadecimalConvert
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number to Convert Into Hexa-Decimal number");
	   int dec = sc.nextInt();
	   String s = decToHex(dec);
	         System.out.println(s);	
	}

	static String decToHex(int dec)
	{
		String hex="";
		do
		{
			int r =dec%16;
			if(r<10)
				hex=r+hex;
			else if(r==10)
				hex='A'+hex;
			else if(r==11)
				hex='B'+hex;
			else if(r==12)
				hex='C'+hex;
			else if(r==13)
				hex='D'+hex;
			else if(r==14)
				hex='E'+hex;
			else
				hex='F'+hex;
			dec=dec/16;
		}while(dec!=0);
		return hex;
	}
}