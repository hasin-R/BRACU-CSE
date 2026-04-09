//Task3
public class Reader
{
  public int cap = 2;
  public String name = "New user";
  public String [] bList;
  public int count;
  
  public Reader(String name)
  {
    this.name = name;
    this.bList = new String[this.cap];
    System.out.println("A new reader is created!");
  }
  
  public Reader(String name, int cap)
  {
    this.name = name;
    this.cap = cap;
    this.bList = new String[this.cap];
    System.out.println("A new reader is created!");
  }
  
  public void addBook(String book)
  {
     if(this.count<this.cap)
     {
       this.bList[this.count++] = book;
     }
     else
     {
       System.out.println("No more capacity"); 
     }
  }
  
  public void updateCapacity(int n)
  {
    this.cap = n;
    String [] newBList = new String[this.cap];
    for(int i = 0; i < this.count; i++)
    {
      newBList[i] = this.bList[i];  
    }
    this.bList = newBList;
    System.out.println("Capacity has been changed to " + this.cap);
  }
  
  public void readerInfo()
  {
    System.out.println("Name: " + this.name);
    System.out.println("Capacity: " + this.cap);
    System.out.println("Books:");
    if(this.count<1)
    {
      System.out.println("No books added yet"); 
    }
    else
    {
      for(int i = 0; i < this.count; i++)
      {
        System.out.println("Book " + (i+1) + ": " + bList[i]); 
      }
    }
  }
}