//Task2
import java.util.Scanner;
public class task2
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String result = "";
    for(int i = 0; i < s1.length(); i++)
    {
      char c = s1.charAt(i);
      if(c == 'a')
      {
        result += 'z';
      }
      else
      {
        result += (char) (c-1);
      } 
    }
    System.out.println(result);
  }
}