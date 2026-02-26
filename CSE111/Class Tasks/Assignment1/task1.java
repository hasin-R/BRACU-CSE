import java.util.Scanner;
public class task1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int max = 0; 
    int min = 0;
    int count = 0;
    double avg = 0;
    for(int i = 1; i <= 10; i++)
    {
      int n = sc.nextInt();
      if(n > 0 && n%2 != 0)
      {
        count++;
        sum += n;
        
        if(count == 1)
        {
          min = n;
          max = n;
        }
        else
        {
          if(n>max)
          {
            max = n; 
          }
          if(n<min)
          {
            min = n; 
          }
        }
      }
    }
    
    if(count == 0)
    {
      System.out.println("No odd positive numbers found"); 
    }
    else
    {
      avg = (double)sum/count;
      System.out.println("Sum " + sum);
      System.out.println("Minimum " + min);
      System.out.println("Maximum " + max);
      System.out.println("Average " + avg);
    }
  }
}