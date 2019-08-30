//Write the Java program to find the Biggest number amoung the four number//
import java.util.Scanner;
 
 class BiggestNum
 {
 public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);

     int n1 = sc.nextInt();
     int n2 = sc.nextInt();
     int n3 = sc.nextInt();
     int n4 = sc.nextInt();

     if(n1>n2 && n1>n3 && n1>n4 || n1>n3 && n1>n4 && n1>n2 || n1>n4 && n1>n2 && n1>n3)
     System.out.println(n1+"is the big Number");
     else if(n2>n3 && n2>n4 || n2>n4 && n2>n3)
     System.out.println(n2+"is The big Number");
     else if(n3>n4)
     System.out.println(n3+"Is the big Number");
     else 
     System.out.println(n4+"is the big Number");
   }
 }