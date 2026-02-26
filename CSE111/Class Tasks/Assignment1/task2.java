import java.util.Scanner;
public class task2
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    String s3 = s1 + ' ' + s2;
    int sum = 0;
    for(int i = 0; i<s3.length(); i++)
    {
       char c = s3.charAt(i);
       if( (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') )
       {
         sum += c;
       }
    }
    System.out.println(s3);
    System.out.println(sum);
  }
}