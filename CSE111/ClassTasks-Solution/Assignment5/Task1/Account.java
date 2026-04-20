public class Account
{
    public String name;
    public String address;
    private double balance;
    public static String bankName = "Badda Bank";
    public static int count;
    public static double totalBalance;
    
    public Account(String name, String address)
    {
      this.name = name;
      this.address = address;
      count++;
    }
    
    public void setBalance(double b)
    {
      this.balance += b;
      totalBalance += b;
    }
    
    public double getBalance()
    {
       return this.balance;
    }
    
    public void printInfo()
    {
      System.out.println("Name: " + this.name + ", address: " + this.address);
      System.out.println("Balance: " + this.balance + " Taka");
    }   
}
