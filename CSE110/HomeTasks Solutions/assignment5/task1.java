//Task1
import java.util.Scanner;
public class task1
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
        System.out.print(j); 
      }
      System.out.println();
    }
    
    for(int i=n-1; i>=1; i--)
    {
      for(int spc=1; spc<=n-i; spc++)
      {
        System.out.print(" ");
      }
      for(int j=1; j<=(2*i)-1; j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}