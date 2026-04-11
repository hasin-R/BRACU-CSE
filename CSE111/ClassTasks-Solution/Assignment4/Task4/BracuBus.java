public class BracuBus
{ 
  public String route;
  public int cap;
  public int count;
  public BracuStudent [] arr;
  
  public BracuBus(String route, int cap)
  {
     this.route = route;
     this.cap = cap;
     this.arr = new BracuStudent[this.cap];
  }
  
  public BracuBus(String route)
  {
    this(route, 2);   
  }
  
  public void board()
  {
    System.out.println("No Passengers");
  }
  
  public void board(BracuStudent obj)
  {
    if(!obj.pass)
    {
      System.out.println("You don't have a bus pass!"); 
    }
    else if(!obj.getLoc().equals(this.route))
    {
      System.out.println("You got on the wrong bus!");
    }
    else if(this.count >= this.cap)
    {
      System.out.println("Bus is full!");
    }
    else
    {
      this.arr[this.count++] = obj;
      System.out.println(obj.name + " boarded the bus.");
    }
  }
  public void board(BracuStudent obj1, BracuStudent obj2)
  {
    this.board(obj1);
    this.board(obj2);
  }
  
  public void showDetails()
  {
    System.out.println("Bus Route: " + this.route);
    System.out.println("Passenger Count: " + this.count + "(Max: " + this.cap + ")");
    System.out.println("Passengers on Board:");
    for(int i=0; i<this.count; i++)
    {
      System.out.print(arr[i].name + " ");
    }
    System.out.println();
  }
} 