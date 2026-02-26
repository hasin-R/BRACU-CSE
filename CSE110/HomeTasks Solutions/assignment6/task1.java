//Task1
import java.util.Scanner;
public class task1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Message: ");
    String s1 = sc.nextLine();
    int max = 0;
    int num = 0;
    boolean found = false;
    
    for(int i=0; i<s1.length()-1; i++)
    {
      char c1 = s1.charAt(i);
      char c2 = s1.charAt(i+1);
      if(c1 >= 48 && c1 <= 57 && c2 >= 48 && c2 <= 57)
      {
        num = (c1-48)*10 + (c2-48);
        if(num>max)
        {
          max = num;
          found = true;
        }
      }
    }
    if(found)
    {
      System.out.println("2-Digit PIN: " + max);
    }
    else
    {
      System.out.println("2-Digit PIN: 0");
    }
  }
}
                          