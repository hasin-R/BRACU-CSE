//Task4
import java.util.Scanner;
public class task4
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Number of Members: ");
    int members = sc.nextInt();

    for(int m = 1; m <= members; m++) 
    {      // outer loop: members
      System.out.print("Exercises for Member-" + m + ": ");
      int ex = sc.nextInt();

      int maxEx = ex;
      if(maxEx > 3)
      {
         maxEx = 3;
         System.out.println("(Can’t do more than 3 exercise)");
      }

      double rawSum = 0;
      double bonusFromHigh = 0;
      boolean allBelow200 = true;

      for(int i = 1; i <= maxEx; i++)
      {
        System.out.print("Exercise-" + i + ": ");
        double cal = sc.nextDouble();

        rawSum += cal;

        if(cal > 350)
        {
           bonusFromHigh += cal * 0.5;   // 50% bonus
        }

        if(cal >= 200)
        {
           allBelow200 = false;
        }
       }

      double total = rawSum + bonusFromHigh;
      double rawAvg = rawSum / maxEx;

      if(rawAvg > 400)
      {
        total += 50 * maxEx;
      }

      double avgEarned = total / maxEx;

      if(allBelow200)
      {
        avgEarned = avgEarned - (avgEarned * 0.10);
      }

      System.out.printf("Average calories earned per day for Member-%d: %.3f\n", m, avgEarned);
    }
  }
}
