//Task4
import java.util.Scanner;
public class task4
{
  public static void main(String [] args)
  {
    double length = 10;
    double width = 13;
    double diagonal = Math.sqrt((length*length)+(width*width));
    System.out.println("Shortest straight-line distance: " + diagonal);
  }
}