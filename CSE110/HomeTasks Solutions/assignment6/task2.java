//Task2
import java.util.Scanner;
public class task2
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    
    String vowels = "";
    for(int i=0; i<s1.length(); i++)
    {
      char ch = s1.charAt(i); 
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
      {
        vowels += ch;
      }
    }
    
    int vIndex = vowels.length()-1; 
    for(int i=0; i<s1.length();i++)
    {
      char ch = s1.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
      {
        System.out.print(vowels.charAt(vIndex));
        vIndex--;
      }
      else
      {
        System.out.print(ch);
      }
    }
  }
}