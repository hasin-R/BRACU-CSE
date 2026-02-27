//Task1
import java.util.Scanner;
public class task1
{
  public static void main(String[] args)
  {
    boolean check = isPrime(7);
    System.out.println(check);
    
    boolean check2 = isPerfect(6);
    System.out.println(check2);
    
    int result = special_sum(8);
    System.out.println(result);
  }
  
  public static boolean isPrime(int a)
  {
    int count = 0;
    for(int i=1; i<=a; i++)
    {
      if(a%i==0)
      {
        count++; 
      }
    }
    if(count==2)
    {
      return true;
    }
    else
    {
      return false; 
    }
  }
  
  public static boolean isPerfect(int b)
  {
    int sum = 0;
    for(int i=1; i<b; i++)
    {
      if(b%i==0)
      {
        sum += i;
      }
    }
    if(sum==b)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public static int special_sum(int c)
  {
    int add = 0;
    for(int i=1; i<=c; i++)
    {
      if(isPrime(i) || isPerfect(i))
      {
        add += i;
      }
    }
    return add;
  }
}