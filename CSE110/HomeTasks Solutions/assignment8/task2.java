//Task2
import java.util.Scanner;
public class task2
{
  public static void main(String [] args)
  {
    showDiamond(5);
  }
  
  public static void showDots(int a)
  {
    for(int i=1; i<=a; i++)
    {
      System.out.print(".");
    }
  }
  
  public static void show_palindrome(int b)
  {
    for(int i=1; i<=b; i++)
    {
      System.out.print(i);
    }
    for(int i=b-1; i>=1; i--)
    {
      System.out.print(i);
    }
  }
  
  public static void showDiamond(int c)
  {
    for(int row=1; row<=c; row++)
    {
      int dots = c-row;
      showDots(dots);
      show_palindrome(row);
      showDots(dots);
      System.out.println();
    }
    
    for(int row=c-1; row>=1; row--)
    {
      int dots = c-row;
      showDots(dots);
      show_palindrome(row);
      showDots(dots);
      System.out.println();
    }
  }
}