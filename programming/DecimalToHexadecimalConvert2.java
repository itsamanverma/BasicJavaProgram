import java.util.Scanner;
public class DecimailToHexadecimalConvert2
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number To Convert into Hexa-decimal Base");
	   int dec = sc.nextInt();
	   String s= decToHexa(dec);
	       System.out.println(s);	
	}
	static String decToHexa(int dec)
	{
		String st="0123456789ABCDEF";

		String hex="";
		do{
			int r=dec/16;
			hex= st.charAt(r)+hex;
			dec=dec/16;
		}while(dec!=0);
		return hex;
	} 
}   