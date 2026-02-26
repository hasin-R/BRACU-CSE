//Task8
import java.util.Scanner;
public class task8
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter an integer:");
      int n = sc.nextInt();
      int count1 = 0;
      int count2 = 0;
      for(int i=1; i<=n; i++)
      {
        System.out.print("Enter number " + i + ":");
        int number = sc.nextInt();
        if(number>=0)
        {
           count1++;
        }
        else
        {
          count2++;
        }
      }
      System.out.println(count1 + " Non-negative Numbers");
      System.out.println(count2 + " Negative Numbers");
  }
}
