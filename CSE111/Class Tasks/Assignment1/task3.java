import java.util.Scanner;

public class task3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("N = ");
    int N = sc.nextInt();

    double[] arr = new double[N];

    System.out.println("Please enter the elements of the array:");
    for(int i = 0; i < N; i++)
    {
      arr[i] = sc.nextDouble();
    }

    // Step 1: Count consecutive duplicates
    int removedCount = 0;

    for(int i = 1; i < N; i++)
    {
      if(arr[i] == arr[i - 1])
      {
        removedCount++;
      }
    }

    // Step 2: Create new array with correct size
    double[] newArr = new double[N - removedCount];

    // Step 3: Fill new array (simplest logic)
    int index = 0;

    for(int i = 0; i < N; i++)
    {
      if(i == 0 || arr[i] != arr[i - 1])
      {
        newArr[index] = arr[i];
        index++;
      }
    }

    // Print new array
    System.out.print("New Array: ");
    for(int i = 0; i < newArr.length; i++)
    {
      System.out.print(newArr[i] + " ");
    }

    System.out.println();
    System.out.println("Removed elements : " + removedCount);

    sc.close();
  }
}

