//Task4
import java.util.Scanner;
public class task4
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the length of array 1: ");
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    System.out.println("Please enter the elements of the arr1:");
    for(int i = 0; i < arr1.length; i++)
    {
      arr1[i] = sc.nextInt();
    }

    System.out.print("Please enter the length of array 2: ");
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];

    System.out.println("Please enter the elements of the arr2:");
    for(int i = 0; i < arr2.length; i++)
    {
      arr2[i] = sc.nextInt();
    }

    boolean isSubset = true;
    for(int i = 0; i < arr2.length; i++)
    {
      boolean found = false;
      for(int j = 0; j < arr1.length; j++)
      {
        if(arr2[i] == arr1[j])
        {
          found = true;
        }
      }

      if(!found)
      {
        isSubset = false;
      }
    }

    if(isSubset)
    {
      System.out.println("Array 2 is a subset of Array 1.");
    }
    else
    {
      System.out.println("Array 2 is not a subset of Array 1.");
    }
  }
}
