//Write the Java Program to Who win first in the Flip the DiceGame//  
import java.util.Scanner;
import java.util.Random;
 class DiceGameWinner
 {
 public static void main(String arg[])
 {
 Scanner sc = new Scanner(System.in);
 Random rd =  new Random();
 System.out.println("Enter the Name of First Player");

 String fName = sc.next();
 System.out.println("Enter the Name of second Player");
 String sName = sc.next();
 int fcount =0,scount= 0;

 while(true)
 {
   System.out.println(fName+"Press any button to flip the Dice");
   sc.next();
   int fno = rd.nextInt(6)+1;
   System.out.println("Your Score"+fno);

   if(fcount + fno <=100)
   fcount= fcount +fno;

   if(fcount==100)
   {
   System.out.println(fName+"You won Game ");
  break;
   }
    System.out.println("Total Score is "+ fcount);
    System.out.println("________________________________");
  
    System.out.println(sName +"Press the button to flip the Dice");
    sc.next();
    int sno = rd.nextInt(6)+1;
    System.out.println("Your Score"+sno);

    if(scount+sno <=100)
    scount = scount+sno;

    if(scount==100)
    {
    System.out.println(sName+"You wow Game");
    break;
    }
      System.out.println("Total Score is "+scount);
     System.out.println("_____________________________");
    }
         
   }
 }