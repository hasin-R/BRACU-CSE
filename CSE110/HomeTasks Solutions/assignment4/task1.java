//Task1
import java.util.Scanner;
public class task1
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Starting number:");
    int start = sc.nextInt();
    System.out.print("Enter an Ending number:");
    int end = sc.nextInt();
    
    System.out.println("Armstrong numbers in this range:");
    for(int num=start; num<=end; num++)
    {
      int sum=0;
      for(int temp=num; temp!=0; temp/=10)
      {
         int rem = temp%10;
         sum += rem*rem*rem;
      }
      if(sum==num)
      {
         System.out.println(num);
      }
    }  
  }
}