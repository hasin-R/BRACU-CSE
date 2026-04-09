public class TaxiLagbe
{
  public String taxiNum;
  public String area;
  public int pCount;
  public int ttlFare;
  public String [] pList;
  
  public TaxiLagbe(String taxiNum, String area)
  {
    this.taxiNum = taxiNum;
    this.area = area;
    this.pList = new String[4];
    System.out.println("A new taxi has been created");
  }
  
  public TaxiLagbe(String taxiNum)
  {
    this.taxiNum = taxiNum;
    this.area = "Khulna";
    this.pList = new String[4];
    System.out.println("A new taxi has been created");
  }
  
  public void addPassenger(String name, int fare)
  {
    if(this.pCount<4)
    {
      this.pList[this.pCount++] = name;
      this.ttlFare += fare;
      System.out.println("Dear " + name + "! Welcome to TaxiLagbe");
    }
    else
    {
      System.out.println("Taxi Full! No more passengers can be added");
    }
  }
  
  public void addPassenger(String name1, int fare1, String name2, int fare2)
  {
    this.addPassenger(name1, fare1);
    this.addPassenger(name2, fare2);
  }
  
  public void printDetails()
  {
    System.out.println("Taxi number: " + this.taxiNum);
    System.out.println("This taxi can cover " + this.area + " area");
    System.out.println("Total Passenger: " + this.pCount);
    System.out.println("Passenger List:");
    for(int i = 0; i < this.pCount; i++)
    {
     System.out.print(this.pList[i] + " ");
    }
    System.out.println();
    System.out.println("Total collected fare: " + this.ttlFare + " Taka");
  }
}