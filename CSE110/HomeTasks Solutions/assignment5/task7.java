//Task7
import java.util.Scanner;
public class task7
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=n; i>=1; i-=2)
    {
      for(int spc=1; spc<=(n-i)/2; spc++)
      {
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
    
    for(int i=3; i<=n; i+=2)
    {
      for(int spc=1; spc<=(n-i)/2; spc++)
      {
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++)
      {
        System.out.print(j);
      }
      System.out.println();
    } 
  }
}