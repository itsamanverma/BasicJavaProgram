import java.util.Scanner;
public class CheckBinaryNumber
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Any number");
	  String n = sc.nextLine();
	  boolean bin = isBinary(n);
	  if(bin)
	  	System.out.println(n+" is Binary number ");
	  else
	  	System.out.println(n+ " is not Binary Number");
	}
	static boolean isBinary(String n)
	{
		for(int i=n.length()-1;i>=0;i--)
		{
			char ch = n.charAt(i);

			if(ch>='a' && ch<='f'|| ch>='A' && ch<='F')
				return false;
		}
	int r =Integer.parseInt(n);
	do
	{
		int s=r%10;
		if(s>1)
			return false;
		r =r/10;
	}while(r!=0);
	return true;
	}
}