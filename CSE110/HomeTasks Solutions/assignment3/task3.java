//Task3
/*
 * import java.util.Scanner;

public class task3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Energy (E): ");
    int energy = sc.nextInt();
    System.out.print("Enter Number of Rivers (N): ");
    int n = sc.nextInt();

    boolean tired = false;
    for(int i = 1; i <= n; i++)
    {
      System.out.print("Enter River Distance D" + i + ": ");
      int d = sc.nextInt();
   
       if(d <= 5)
       {
         energy -= 2;
       }
       else
       {
         energy -= d / 2;
       }

       if(energy < 0)
       {
         System.out.println("Tired at River " + i);
         tired = true;
         break;
       }
     }

     if(!tired)
     {
       System.out.println("All Done\n" + energy + " energy Left");
     }
     
    }
}
*/



//Task3
import java.util.Scanner;

public class task3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Energy (E): ");
    int energy = sc.nextInt();
    System.out.print("Enter Number of Rivers (N): ");
    int n = sc.nextInt();

    boolean tired = false;
    int riverStopped = -1;
    for(int i = 1; i <= n; i++)
    {
      System.out.print("Enter River Distance D" + i + ": ");
      int d = sc.nextInt();

       int cost;
       if(d <= 5)
       {
         cost = 2;
       }
       else
       {
         cost = d / 2;
       }

       energy -= cost;
       if(energy < 0)
       {
         tired = true;
         riverStopped = i;
         break;
       }
     }

        if(tired)
        {
          System.out.println("Tired at River " + riverStopped);
        }
        else
        {
           System.out.println("All Done\n" + energy + " energy Left");
        }
        
    }
}



