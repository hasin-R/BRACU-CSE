//Task5
import java.util.Scanner;
public class task5
{ 
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    int count = 0;
    boolean counting = false;
    for(int i=s1.length()-1; i>=0; i--)
    {
      char c = s1.charAt(i);
       if(c!=' ')
       {
         counting = true;
         count++;
       }
       else if(counting)
       {
         break;
       }
    }
    System.out.println(count);
  }
}