//Task5
public class task5
{
  public static void main (String [] args)
  {
    double a = 4.5;
    double b = 9.5;
    double c = Math.sqrt((a*a)+(b*b));
    double sinA = a/c;
    double cosA = b/c;
    double sinB = b/c;
    double cosB = a/c;
    System.out.println("sin(A)="+sinA+" "+"cos(A)="+cosA);
    System.out.println("sin(B)="+sinB+" "+"cos(B)="+cosB); 
  }
}