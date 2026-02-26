//Task3
import java.util.Scanner;
public class task3
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1; i<=n; i++)
    {
      for(int spc=1; spc<=n-i; spc++)
      {
         System.out.print(" ");
      }
      for(int j=1; j<=(2*i)-1; j++)
      {
        if(i==n)
        {
          System.out.print(j);
        }
        else if(j==1)
        {
          System.out.print(1);
        }
        else if(j==(2*i)-1)
        {
          System.out.print((2*i)-1);
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