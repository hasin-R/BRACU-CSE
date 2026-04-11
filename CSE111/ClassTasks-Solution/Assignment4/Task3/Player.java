public class Player
{
  private String pName;
  private int age;
  private int match;
  
  public Player(String name, int age, int match)
  {
     this.pName = name;
     this.age = age;
     this.match = match;
  }
  
  public String getPName()
  {
    return this.pName;
  }
  
   public int getAge()
  {
    return this.age;
  }
  
   public int getMatches()
  {
    return this.match;
  }
}