public class Shop 
{
  public int cap;
  public String name;
  public int count;
  public String [] iList;
  public int [] pList;
  
  public Shop(String name, int cap)
  {
    this.name = name;
    this.cap = cap;
    this.iList = new String[cap];
    this.pList = new int[cap];
    System.out.println(this.name + " shop created!");
  }
  
  public Shop(int cap)
  {
    //this("Mega", cap);     *shortcut
    this.name = "Mega";
    this.cap = cap;
    this.iList = new String[cap];
    this.pList = new int[cap];
    System.out.println(this.name + " shop created!");
  }
  
  public void addItem(String item, int price)
  {
    if(this.count<this.cap)
    {
      this.iList[this.count] = item;
      this.pList[this.count] = price;
      this.count++;
    }
    else
    {
      System.out.println(item + ", could not be added");
    }
  }
  
  public void addItem(Shop obj, String item)
  {
    boolean found = false;
    for(int i=0; i<obj.count; i++)
    {
      if(item.equals(obj.iList[i]))
      {
        found = true;
        this.addItem(item, obj.pList[i]);
        break;
      }
    }
    if(!found)
    {
      System.out.println(item + ", not found in " + obj.name + "!"); 
    }
  }
  
  public void purchase(String item)
  {
    boolean found = false;
    for(int i=0; i<this.count; i++)
    {    
      if(item.equals(iList[i]))
      {
        found = true;     
        System.out.println("Purchase Complete!");
        break;
      }
    }
    if(!found)
    {
      System.out.println(item + ", is not available in this shop");
    }
  }
  
  public void info()
  {
    System.out.println("Shop Name: " + this.name);
    System.out.println("Item Details:");
    if(count==0)
    {
      System.out.println("No items in shop");
    }
    else
    {
      System.out.println(count + "/ " + cap);
      for(int i = 0; i<this.count; i++)
      {
        System.out.println(this.iList[i] + " - " + this.pList[i] + " Tk");
      } 
    }
  }
}