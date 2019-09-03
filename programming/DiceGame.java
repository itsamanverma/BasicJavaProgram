import java.util.Scanner;
import java.util.Random;
 class DIceGame
 {
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 Random rd = new Random();
 System.out.println("Enter the First player name");
 String fEname = sc.next();
 System.out.println("Enter the Second player name");
 String sEname = sc.next();
 System.out.println(fEname+"press any button to flip he dice");
 sc.next();
 int fno = rd.nextInt(6)+1;
 System.out.println(sEname+"press any button to flip he dice");
 sc.next();
 int sno = rd.nextInt(6)+1;
 if(fno>sno)
  System.out.println(fEname+"won the game");
   else if (sno<fno) 
   System.out.println(sEname+"won the game");
   else
   System.out.println("draw");

   System.out.println("Score");
   System.out.println(fEname+":"+fno);
   System.out.println(sEname+":"+sno);
	}
 
 }