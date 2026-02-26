//Task2
import java.util.Scanner;
public class task2
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Age: ");
    int age = sc.nextInt();
    System.out.print("Electricity consumed: ");
    int kWh = sc.nextInt();
    double initialBill = kWh*15;
    double finalBill = 0;
    
    if(age<18)
    {
      finalBill = initialBill - (initialBill*0.2);
    }
    else if(age>=18 && age<=60)
    {
      finalBill = initialBill;
    }
    else
    {
      finalBill = initialBill-(initialBill*0.1);
    }
    
    if(kWh>100)
    {
      finalBill = finalBill + (finalBill*0.05);
    }
    System.out.println("Final Bill: " + finalBill + " Taka");
  }
}