//Task3
import java.util.Scanner;
public class task3 
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of days: ");
    int N = sc.nextInt();

    for(int day = 1; day <= N; day++)
    {
      System.out.println("Enter sales for Day " + day + ":");
      double total = 0;

      for(int p = 1; p <= 3; p++)
      {
        System.out.print("Product " + p + ": ");
        total += sc.nextDouble();
      }
   
      double taxRate = 0;
      if(total >= 500)
      {
        taxRate = 0.10;
      }
      else if(total >= 200)
      {
        taxRate = 0.05;
      }
      else if(total >= 100)
      {
        taxRate = 0.02;
      }

      double totalWithTax = total + (total * taxRate);

      System.out.println("Day " + day + ": Total Sales with Tax: " + totalWithTax);
    }
  }
}
