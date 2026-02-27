//Task4
import java.util.Scanner;
public class task4
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Fan Message: ");
    String msg = sc.nextLine();

    int madridCount = 0;
    int cityCount = 0;
    boolean isClose = false;
    boolean isDestroy = false;

    int n = msg.length();

    for(int i = 0; i < n; i++)
    {
            
      if(i + 6 <= n)
      {
        boolean match = true;
        String word = "Madrid";
        for(int j = 0; j < 6; j++)
        {
          char c = msg.charAt(i + j);
          if(c != word.charAt(j) && c != "MADRID".charAt(j))
          {
            match = false;
            break;
          }
        }
        if(match) madridCount++;
       }

            
       if(i + 4 <= n)
       {
         boolean match = true;
         String word = "City";
         for(int j = 0; j < 4; j++)
         {
           char c = msg.charAt(i + j);
           
           if(c != 'C' && c != 'c' && word.charAt(j) == 'C') { match = false; break; }
           if(j > 0 && c != word.charAt(j) && c != "CITY".charAt(j)) { match = false; break; }
         }
                if (match) cityCount++;
        }

        if(i + 5 <= n)
        {
          boolean match = true;
          String word = "close";
          for(int j = 0; j < 5; j++)
          {
            if(msg.charAt(i + j) != word.charAt(j)) { match = false; break; }
          }
          if(match) isClose = true;
        }

        if(i + 7 <= n)
        {
          boolean match = true;
          String word = "destroy";
          for(int j = 0; j < 7; j++)
          {
            if(msg.charAt(i + j) != word.charAt(j)) { match = false; break; }
          }
          if(match) isDestroy = true;
         }
        }

        if(madridCount > cityCount)
        {
          System.out.println("Madrid Supporter");
          if (isClose) System.out.println("Fan expect a close match");
          else if (isDestroy) System.out.println("Fan expects a dominating victory!");
        } 
        else if(cityCount > madridCount)
        {
          System.out.println("City Supporter");
          if (isClose) System.out.println("Fan expect a close match");
          else if (isDestroy) System.out.println("Fan expects a dominating victory!");
        } 
        else 
        {
          System.out.println("Neutral");
          System.out.println("Hard to read the fan sentiment");
        }
    }
}