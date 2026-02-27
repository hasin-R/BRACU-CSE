//Task5
import java.util.Scanner;
public class task5
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter the N-digit vault code: ");
      int n = sc.nextInt();
      if(n==0)
      {
        System.out.println("0"); 
        return;
      }
      int temp = n;
      int count = 0;
      while(temp!=0)
      {
        temp/=10;
        count++;
      }
      int divisor = 1;
      for(int i=1; i<count; i++)
      {
        divisor*=10;
      }
      int num=n;
      while(divisor>0)
      {
        int digit = num/divisor;
        System.out.print(digit);
        num %= divisor;
        divisor /= 10;
        if(divisor>0)
        {
          System.out.print(","); 
        }
      }
      System.out.println();
  }
}
