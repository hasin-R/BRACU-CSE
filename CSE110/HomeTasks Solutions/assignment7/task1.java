//Task1
import java.util.Scanner;
public class task1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("N = ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < arr.length; i++)
    {
      arr[i] = sc.nextInt();
    }

    System.out.println("Original array:");
    for(int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] > 0)
      {
        arr[i] = 1;
      }
      else if(arr[i] < 0)
      {
        arr[i] = 0;
      }
    }

    System.out.println("After modifying:");
    for(int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
