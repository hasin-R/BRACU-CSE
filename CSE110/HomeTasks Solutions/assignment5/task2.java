//Task2
import java.util.Scanner;
public class task2
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1; i<=n; i++)
    {
      for(int j=1; j<=n; j++)
      {
        if(i==n||j==n||j+i==n+1)
        {
          System.out.print(j); 
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}