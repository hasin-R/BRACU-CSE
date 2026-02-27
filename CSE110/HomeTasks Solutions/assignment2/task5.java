//Task5
import java.util.Scanner;
public class task5
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka)");
    int n1 = sc.nextInt();
    System.out.println("Enter the amount, customer gave(Taka)");
    int n2 = sc.nextInt();
    if(n1>n2)
    {
      System.out.println("Please pay "+ (n1-n2) +" taka more."); 
    }
    else if(n1==n2)
    {
       System.out.println("The returned amount is 0 taka.");
    }
    else
    {
        int note100 = 0,note50 = 0,note20 = 0,note10 = 0,coin5 = 0,coin2 = 0,coin1 = 0;
        int returned = (n2-n1);      
        if(returned>=100)
        {
           note100 = returned/100;
           returned %= 100;
        }
        if(returned>=50)
        {
           note50 = returned/50;
           returned %= 50;
        }
        if(returned>=20)
        {
           note20 = returned/20;
           returned %= 20;
        }
        if(returned>=10)
        {
           note10 = returned/10;
           returned %= 10;
        }
        if(returned>=5)
        {
           coin5 = returned/5;
           returned %= 5;
        }
        if(returned>=2)
        {
           coin2 = returned/2;
           returned %= 2;
        }
        if(returned>=1)
        {
           coin1 = returned/1;
           returned %= 1;
        }
        System.out.println("The returned amount is " + (n2-n1) + " taka.");
        System.out.println("100 taka note:" + note100);
        System.out.println("50 taka note:" + note50);
        System.out.println("20 taka note:" + note20);
        System.out.println("10 taka note:" + note10);
        System.out.println("5 taka coin:" + coin5);
        System.out.println("2 taka coin:" + coin2);
        System.out.println("1 taka coin:" + coin1);
    }
  }
}
