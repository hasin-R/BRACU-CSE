//Task4
import java.util.Scanner;
public class task4
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    System.out.println(fibonacci(n));
  }
  
  public static int fibonacci(int a)
  {
    if(a==0)
    {
      return 0;
    }
    else if(a==1)
    {
      return 1;
    }
    else
    {
      return fibonacci(a-1) + fibonacci(a-2);
    }
  }
}