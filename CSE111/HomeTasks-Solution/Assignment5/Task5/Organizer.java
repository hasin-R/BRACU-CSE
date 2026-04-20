public class Organizer
{
  public String org;
  public Event [] arr2 = new Event[4];
  public int count2;
  
  public Organizer()
  {
     System.out.println("Please provide the organizer's name");
  }
  
  public Organizer(String org)
  {
    this.org = org; 
  }
  
  public void organizeEvent(Event e)
  {
    if(count2<4)
    {
      arr2[count2] = e;
      System.out.println(this.org + " successfully organized " + e.getName());
      count2++;
    }
  }
  
  public void searchEventByDate(String d)
  {
    boolean found = false;
    for(int i = 0; i < count2; i++)
    {
      if(arr2[i].date.equals(d))
      {
        System.out.println(arr2[i].getName());
        found = true;
        break;
      }
    }
    if(!found)
    {
      System.out.println("No event is scheduled for " + d); 
    }
  }
}