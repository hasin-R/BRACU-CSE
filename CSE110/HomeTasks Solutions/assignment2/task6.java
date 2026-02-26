//Task6
import java.util.Scanner;
public class task6
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the first number:");
    int n1 = sc.nextInt();
    System.out.println("Input the second number:");
    int n2 = sc.nextInt();
    System.out.println("Input the third number:");
    int n3 = sc.nextInt();
    if(n1==n2 && n2==n3)
    {
      System.out.println("All numbers are equal"); 
    }
    else if(n1!=n2 && n2!=n3 && n1!=n3)
    {
      System.out.println("All numbers are different");
    }
    else
    {
       System.out.println("Neither all are equal or different");
    }
  }
}