//Task3
import java.util.Scanner;
public class task3
{
  public static void main(String [] args)
  {
    int [] arr = {5,6,2,1,8,7};
    int index = 2;
    print_element(arr,index);
  }
  
  public static void print_element(int [] arr, int index)
  {
    if(index == arr.length)
    {
      return;
    }
    else
    {
      System.out.println(arr[index]);
      print_element(arr, index+1);
    }
  }
}