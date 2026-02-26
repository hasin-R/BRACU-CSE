//Task7
import java.util.Scanner;
public class task7
{
  public static void main (String [] args)
  {
    int sum1 = 0;
    int sum2 = 0;
      for(int i=1; i<=600; i++)
      {
        if(i%7==0 || i%9==0)
        {
          sum1 += i;
        }
        if(i%7==0 && i%9==0)
        {
           sum2 += i;
        }
      }
      System.out.println(sum1-sum2);
  }
}
