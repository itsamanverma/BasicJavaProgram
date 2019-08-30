//Write the java program to define the method to checked the passed yaer is leap year or not//
import java.util.Scanner;

class CheckLeapYear
{
	public static void main(String[] args) 
	{
		
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter any year");

	int year = sc.nextInt();

	 boolean Leap = false;

	 	for(int i=1900;i<=year;i++)
    {
           if(i%4==0)
           	{
           		if(i%100==0)
           		{
                   if(i%400==0)
                     leap = true;
                   else 
                   	leap = false;
           	  }
           	else 
           		leap = true;
            }
           else 
           leap = false;
    }
           if(leap)
           	System.out.println(year+"Is a leap year");
           else 
            System.out.println(year+"is not a leap year");

  }

