//Task2
import java.util.Scanner;
public class task2
{
  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < arr.length; i++)
    {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }

    int target = sc.nextInt();
    boolean found = false;
    int idx = -1;

    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == target)
      {
        found = true;
        idx = i;
         break;
      }
    }

    if(found)
    {
      System.out.println(target + " is at index " + idx);
    }
    else 
    {
      System.out.println("Element not found");
    }
  }
}
