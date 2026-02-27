//Task4
public class CellPhone
{
  public String model = "unknown";
  public int count = 0;
  public String [] contactList = new String[3];
  
  public void printDetails()
  {
    System.out.println("Phone Model " + model);
    System.out.println("Contacts Stored " + count);
    if(count>0)
    {
      System.out.println("Stored Contacts:"); 
      for(int i = 0; i < count; i++)
      {
        System.out.println(contactList[i]); 
      }
    }   
  }
  
  public void storeContact(String c)
  {
    if(count<3)
    {
      contactList[count++] = c;
      System.out.println("Contact Stored");
    }
    else
    {
       System.out.println("Memory full. New contact can't be stored.");
    }
  }
}