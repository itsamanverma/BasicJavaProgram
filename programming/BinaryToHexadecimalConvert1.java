//write the java Program to convert the Binary number  into Hexadecimal Number //
import java.util.Scanner;
public class BinaryToHexadecimalConvert1
{
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The Binary Number To Convert Into Hexadecimal");
      int bin = sc.nextInt();
      int dec = binToDec(bin);
           System.out.println("Hexadecimal Convertion ot The Binary Number is"+decToHex(dec));
  }
      static int binToDec(int bin)
      {
        int dec=0,count=0;
        do
        {
        int r = bin%10;
        dec = dec + r*pow(2,count);
        bin = bin/10;
        count++;
        }while(bin!=0);
         return dec;
     }
         static String decToHexa(int dec)
         {
            String hx="";
            do
            {
            int r=dec%16;
                  if(r<10)
                    hx =r+hx;
                  else
                    hx =(char)(r+55)+hx;
            dec = dec/10;
            }while(dec!=0);
            return hx;
         }
          static int pow(int n ,int p)
          {
           int pw=1;
           while(p>0)
           {
           pw=pw*n;
           p--;
           }
          return pw;
          }
  
}