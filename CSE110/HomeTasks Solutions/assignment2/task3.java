//Task3
import java.util.Scanner;
public class task3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();
    float max = a;
    float min = a;
    
    if(b>max)
    {
      max = b; 
    }
    if(c>max)
    {
      max = c;
    }
    if(b<min)
    {
      min = b;
    }
    if(c<min)
    {
      min = c;
    }
    System.out.println("Maximum number is " + max);
    System.out.println("Minimum number is " + min);
  }
}