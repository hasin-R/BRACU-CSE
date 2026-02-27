//Task4
import java.util.Scanner;
public class task4
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int s1 = sc.nextInt();
    int s2 = sc.nextInt();
    int s3 = sc.nextInt();
    if(s1==s2 && s2==s3)
    {
      System.out.println("This is a Equilateral triangle"); 
    }
    else if(s1==s2 || s2==s3 || s1==s3)
    {
      System.out.println("This is a Isosceles triangle");
    }
    else
    {
       System.out.println("This is a Scalene triangle");
    }
  }
}
