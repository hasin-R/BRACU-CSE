//Task3
import java.util.Scanner;
public class task3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String longest = "";
    boolean first = true;
    
    System.out.println("Names of the spells: ");
    while(true)
    {
      String s = sc.nextLine();
      if(s.equals("stop"))
      {
        break;
      }
      
      String cleaned = "";
      for(int i=0; i<s.length(); i++)
      {
        char ch = s.charAt(i);
        if(ch>='A' && ch<='Z')
        {
          cleaned += ch;
        }
        else if(ch>='a' && ch<='z')
        {
          cleaned += (char)(ch-32); 
        }
      }
      
      if(first || cleaned.length() > longest.length())
      {
        longest = cleaned;
        first = false;
      }
    }
    
    int power = 0;
    for(int i=0; i<longest.length(); i++)
    {
      power += longest.charAt(i); 
    }
    System.out.println("Largest Spell : " + longest);
    System.out.println("Power Level : " + power);
  }
}