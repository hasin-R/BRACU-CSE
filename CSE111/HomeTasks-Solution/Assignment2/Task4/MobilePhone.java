//Task4
public class MobilePhone
{
  public int contacts;
  public int capacity;
  public String [] cList;
  public int [] numbers;
    
  public void setContactCapacity(int a)
  {
    capacity = a;
    cList = new String [capacity];
    numbers = new int [capacity];
  }
  public void details()
  {
    System.out.println("Total Contacts: " + contacts);
    System.out.println("Contact List:");
    for(int i = 0; i < contacts; i++)
    {
      System.out.println(cList[i] + ":" + numbers[i]);
    }
  }
  
  public void addContact(String s1, int b)
  {
    if(contacts<capacity)
    {
      cList[contacts] = s1;
      numbers[contacts] = b;
      contacts++;
      System.out.println("The contact of " + s1 + " is added.");
    }
    else
    {
      System.out.println("Storage Full!!"); 
    }
  }
  
  public void makeCall(int c)
  {
    boolean found = false;
    for(int i = 0; i < contacts; i++)
    {
      if(numbers[i] == c)
      {
        System.out.println("Calling " + cList[i] + " . . .");
        found = true;
        break;
      }
    }
    if(!found)
    {
      System.out.println("Calling " + c + " . . ."); 
    }
  }
}