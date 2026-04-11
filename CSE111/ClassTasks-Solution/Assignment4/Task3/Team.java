public class Team
{
  public String tName;
  public Player [] arr1 = new Player[11];
  public int count;
  
  public Team()
  {
    
  }
  
  public Team(String name)
  {
    this.tName = name; 
  }
  
  public void updateName(String name)
  {
     this.tName = name;
  }
  
  public void addPlayer(Player obj)
  {
    if(this.count<11)
    {
       arr1[this.count++] = obj;
    }
  }
  
  public void printDetail()
  {
    System.out.println("Team: " + this.tName);
    System.out.println("List of players:");
    for(int i = 0; i < this.count; i++)
    {
      System.out.println("Name : " + arr1[i].getPName());
      System.out.println("Age: " + arr1[i].getAge() + ", Total Matches: " + arr1[i].getMatches());
    }
  }
}