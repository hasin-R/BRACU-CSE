//Task2
/*
import java.util.Scanner;
public class task2
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of students to check: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++)
    {
      System.out.print("Enter student ID: ");
      int id = sc.nextInt();

      boolean isLucky = false;

    for (int power=1; power<=id; power*=2)
    {
      if (power == id) 
      {
        isLucky = true;
        break;
      }
    }

      if(isLucky)
      {
        System.out.println("Lucky ID");
      } 
      else 
      {
        System.out.println("Not Lucky");
      }
    }
  }
}
*/



import java.util.Scanner;
public class task2
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of students to check: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++)
    {
      System.out.print("Enter student ID: ");
      int id = sc.nextInt();

      boolean isLucky = false;

    for (int power=1; power<=id; power*=2)
    {
      if (power == id) 
      {
        System.out.println("Lucky ID");
        isLucky = true;
        break;
      }
    }

      if(!isLucky)
      {
        System.out.println("Not Lucky");
      } 
    }
  }
}