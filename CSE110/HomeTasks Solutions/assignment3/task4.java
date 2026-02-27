//Task4
import java.util.Scanner;
public class task4
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    while(num>0)
    {
       int digit = num%10;
       System.out.print(digit);
       num = num/10;
       if(num>0)
       {
         System.out.print(", ");
       }
    }
    System.out.println();
  }
}