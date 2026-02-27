//Task3
import java.util.Scanner;
public class task3
{
  public static void main(String [] args)
  {
    calcYearlyTax();  
  }
  
  public static double calcTax(int age, double salary)
  {
    if(age<18)
    {
      return 0.0;
    }
    else if(salary<10000)
    {
      return 0.0;
    }
    else if(salary<=20000)
    {
      return salary*0.07;
    }
    else
    {
      return salary*0.14;
    }
  }
  
  public static void calcYearlyTax()
  {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    double ttl = 0.0;
    
    for(int month=1; month<=12; month++)
    {
      double income = sc.nextDouble();
      double tax = calcTax(age,income);
      System.out.println("Month" + month + " tax: " + tax);
      ttl += tax;
    }
    System.out.println("Total Yearly Tax: " + ttl);
  }
}