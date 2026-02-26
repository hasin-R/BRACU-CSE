//Task3
import java.util.Scanner;
public class task3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int n = sc.nextInt();
    double[] arr = new double[n];

    for(int i = 0; i < arr.length; i++)
    {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextDouble();
    }

    double max = arr[0];
    int maxIdx = 0;
    double min = arr[0];
    int minIdx = 0;
    double sum = 0.0;

    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] > max)
      {
        max = arr[i];
        maxIdx = i;
      }

      if(arr[i] < min) 
      {
        min = arr[i];
        minIdx = i;
      }
      sum = sum + arr[i];
    }

    double avg = sum / arr.length;

    System.out.println("Maximum element " + max + " found at index");
    System.out.println(maxIdx);
    System.out.println("Minimum element " + min + " found at index");
    System.out.println(minIdx);
    System.out.println("Summation: " + sum);
    System.out.printf("Average: %.2f" , avg);
  }
}
