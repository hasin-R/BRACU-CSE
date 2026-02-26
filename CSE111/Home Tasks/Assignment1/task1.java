//Task1
import java.util.Scanner;
public class task1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a>b)
    {
      int temp = a;
      a = b;
      b = temp;
    }
    int PrimeCount = 0;
    for(int i = a; i <= b; i++)
    {
       int divCount = 0;
       for(int j = 1; j <= i; j++)
       {
          if(i % j == 0)
          {
            divCount++; 
          }
       }
       if(divCount == 2)
       {
         PrimeCount++; 
       }
    }
    System.out.println("There are " + PrimeCount + " prime numbers between " + a + " and " + b + ".");
  }
}