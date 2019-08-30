//check the Hexa Decimal Number//
import java.util.Scanner;
public class CheckHexadecimalNumber
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number");
	  String s=sc.nextLine();
	  boolean hx = checkHexa(s);
	  if(hx)
	  	System.out.println(s+" is Hexa Number");
	  else 
	  	System.out.println(s+" is Not Hexa Number");
	}
	static boolean checkHexa(String s)
	{
	for(int i=s.length()-1;i>=0;i--)
	  {
		char ch =s.charAt(i);
		if(ch>='A' && ch<='F' || ch>='a' && ch>='f' ||ch>='0' && ch<='9')
			return true;
	  }
	//char[] c_arr=tocharArray(s);
	//if(c_arr>='1' && c_arr<='9')
		//retrun true 
	//else 
		return false;
    }
}