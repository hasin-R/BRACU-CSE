//Task3
import java.util.Scanner;
public class task3
{
  public static void main(String [] args)
  {
    int ID = 1000054943;
    
    int two_rightmost_digits = ID%100;
    
    int a = two_rightmost_digits / 10;
    int b = two_rightmost_digits % 10;
    
    System.out.println(b+""+a);
  }
}