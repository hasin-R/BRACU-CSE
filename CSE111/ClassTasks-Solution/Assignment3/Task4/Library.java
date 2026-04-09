public class Library
{
  public int cap;
  public int ttl;
  public String [] bList;
  
  public Library(int cap)
  {
    this.cap = cap;
    bList = new String [this.cap];
    System.out.println("A library has been created with capacity " + this.cap);
  }
  
  public void addBook(String s)
  {
    if(this.ttl<this.cap)
    {
      bList[ttl++] = s;
      System.out.println("Book '" + s + "' added to the library");
    }
    else
    {
      System.out.println("Exceeds maximum capacity. You can't add more than " + this.cap + " books");
    }    
  }
  
  public void printDetail()
  {
     System.out.println("Maximum Capacity: " + this.cap);
     System.out.println("Total Books: " + this.ttl);
     System.out.println("Book list:");
     for(int i = 0; i < this.ttl; i++)
     {
       System.out.println(bList[i]); 
     }
  }
}