//Task4
public class MoneyTracker
{ 
  public String name;
  public double balance;
  public double lstIncome;
  public double lstExpense;
  
  public MoneyTracker()
  {
    System.out.println("A new money tracker has been launched."); 
  }
  
  public void createTracker(String name)
  {
    this.balance = 1.0;
    this.name = name; 
  }
  
  public void income(int n)
  {
    this.lstIncome = n;
    this.balance += n;
    System.out.println("Balance Updated!");
  }
  
  public void expense(int n)
  {
    if(this.balance<n)
    {
      System.out.println("Not enough balance."); 
    }
    else
    {
      this.lstExpense = n;
      this.balance -= n;
      if(this.balance == 0)
      {
        System.out.println("You're broke!");
      }
      else
      {
        System.out.println("Balance Updated.");
      } 
    }  
  }
  
  public String info()
  {
    return "Name: " + this.name + "\nCurrent Balance: " + this.balance;
  }
  
  public void showHistory()
  {
    System.out.println("Last added: " + this.lstIncome);
    System.out.println("Last spent: " + this.lstExpense);
  }
}