//Task1
import java.util.Scanner;
public class task1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int mins = sc.nextInt();
    int year = mins / (60*24*365);
    int remaining_mins = mins % (60*24*365);
    int day = remaining_mins / (60*24);
    
    System.out.println(mins + " minutes is approximately " + year +" years and " + day + " days");
  }
}