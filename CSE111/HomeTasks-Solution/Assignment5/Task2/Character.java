public class Character
{
  public static int ttlChar;
  public static double ttlHealth;
  public static int kids;
  public static int teens;
  public static int adults;
  public static Character strongest;
  
  public int id;
  public String name;
  public String group;
  public int health;
  
  public Character(String name, String group, int health)
  {
     ttlChar++;
     this.id = ttlChar;
     this.name = name;
     this.group = group;
     this.health = health;
     ttlHealth += this.health;
     
     if(this.group.equals("Kid"))
     {
       kids++;
     }
     else if(this.group.equals("Teen"))
     {
       teens++;
     }
     else if(this.group.equals("Adult"))
     {
       adults++;
     }
     if(strongest == null || this.health > strongest.health)
     {
       strongest = this; 
     }
  }
  
  public Character(String name, int health)
  {
    this(name, "Teen", health); 
  }
  
  public void printDetails()
  {
    System.out.println("ID: " + this.id + ", Name: " + this.name);
    System.out.println("Group: " + this.group);
    System.out.println("Health: " + this.health);
  }
  
  public static void printStats()
  {
    System.out.println("Total Characters: " + ttlChar);
    System.out.println("Kids: " + kids);
    System.out.println("Teens: " + teens);
    System.out.println("Adults: " + adults);
    if(ttlChar == 0)
    {
       System.out.println("Average Health: " + 0);
    }
    else
    {
      double avg = ttlHealth/ttlChar;
      System.out.println("Average Health: " + avg); 
    }
    
    if(strongest == null)
    {
      System.out.print("Strongest Character: ");
      System.out.println("None"); 
    }
    else
    {
       System.out.println("Strongest Character:");
      System.out.println(strongest.name + " (Health " + strongest.health + ")");
    }
  }
}