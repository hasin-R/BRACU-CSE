//Task3
import java.util.Scanner;
public class task3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int N = sc.nextInt();
    int [] arr = new int [N];
    for(int i=0; i<N; i++)
    {
      arr [i] = sc.nextInt(); 
    }
    
    for(int i=0; i<N; i++)
    {
      boolean alreadyCounted = false;
      for(int j=0; j<i; j++)
      {
        if(arr[i] == arr[j])
        {
          alreadyCounted = true;
          break;
        }
      }
        
      if(alreadyCounted)
      {
        continue; 
      }
        
      int count = 0;
      for(int k=0; k<N; k++)
      {
        if(arr[i] == arr[k])
        {
          count++;
        }  
      }
      System.out.println(arr[i] + " - " + count + " times");
    }
  } 
}