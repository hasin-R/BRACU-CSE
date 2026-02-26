//Task5
public class task5
{
  public static void main(String[] args)
  {

    int[] marks = {85, 90, 75, 44, 99};
    String[] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
    for(int i = 0; i < marks.length - 1; i++)
    {
      for(int j = 0; j < marks.length - 1 - i; j++)
      {
        if(marks[j] > marks[j + 1])
        {
          int tempMark = marks[j];
          marks[j] = marks[j + 1];
          marks[j + 1] = tempMark;

          String tempName = names[j];
          names[j] = names[j + 1];
          names[j + 1] = tempName;
        }
      }
    }

    System.out.println("Sorted Array:");
    for(int i = 0; i < marks.length; i++)
    {
      System.out.print(marks[i] + " ");
    }
    System.out.println();

    for(int i = 0; i < names.length; i++)
    {
      System.out.print(names[i] + " ");
    }
    System.out.println();
  }
}
