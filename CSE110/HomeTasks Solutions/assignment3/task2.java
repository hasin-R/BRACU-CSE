//Task2
import java.util.Scanner;
public class task2
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter number of Herbs(H): ");
    int H = sc.nextInt();
    System.out.print("Please enter number of Crystals(C): ");
    int C = sc.nextInt();
    
    int count = 0;
    while(H>=3 && C>=2)
    {
      count++;
      H -= 3;
      C -= 2;
      System.out.println("Potion-" + count + " created");
      System.out.println("Remaining Herbs: " + H + ", Remaining Crystals: " + C);
    }
    System.out.println("Potions Created: " + count);
    if(count%2==0)
    {
      System.out.println("Stable Brew"); 
    }
    else
    {
       System.out.println("Volatile Elixir"); 
    }
  }
}