import java.util.Scanner;
public class DecimalToBaseConvert
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number to Convert into required Base Number ");
	   int dec= sc.nextInt();
	   System.out.println("Enter The Base Required To Convert");
	   int base=sc.nextInt();
	   String s = decToBase(dec,base);
	        System.out.println(s);	
	}
	static String decToBase(int dec,int base)
	{
		String con ="";
		do
		{
			int r = dec%base;
			if(r<10)
				con=r+con;
			else
				con=(char)(r+87)+con;
			dec=dec/base;
		}while(dec!=0);
		return con;
	}
}