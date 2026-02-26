//Task2
import java.util.Scanner;
public class task2
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int exp = sc.nextInt();
    
    int x = power(base,exp);
    System.out.println(x);
  }
  
  public static int power(int base,int exp)
  {
    if(exp == 0)
    {
      return 1;
    }
    else
    {
      return base*power(base,exp-1);
    }
  }
}