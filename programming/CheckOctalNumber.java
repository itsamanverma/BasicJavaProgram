//write the Java Program to check the Number is the Octal or Not?//
import java.util.Scanner;
public class CheckOctalNumber
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number");
	   String oct =sc.nextLine();
	   boolean rs = isOctal(oct);
	   if(rs)
	     System.out.println(oct+" is Octal Number");
	    else
	      System.out.println(oct+" is Not Octal Number");	
	}
	static boolean isOctal(String oct)
	{
		for(int i=oct.length()-1;i>=0;i--)
		{
			char ch=oct.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
				return false;
		}
		int s=Integer.parseInt(oct);
		do
		{
            int r =s%10;
            if(r>7)
            return false;
            s= s/10; 
		}while(s!=0);
		return true;
	}
}