public class Artifact
{
  private String name;
  private String creator;
  private int power;
  
  private static Artifact [] vault = new Artifact[4];
  private static int count;
  private static Artifact strongest;
  
  public Artifact(String name, String creator)
  {
    this.name = name;
    this.creator = creator;
    this.power = CalcPower();
    
    if(strongest == null || this.power > strongest.power)
    {
      strongest = this; 
    }
  }
  
  public Artifact(String name)
  {
    this(name, "Okabe"); 
  }
  
  public String GetName()
  {
    return this.name; 
  }
  
  public int CalcPower()
  {
    int sum = 0;
    int len = name.length();
    if(len%2==0)
    {
      for(int i = 0; i < len; i+=2)
      {
        sum += name.charAt(i); 
      }
    }
    else
    {
      for(int i = 1; i < len; i+=2)
      {
        sum += name.charAt(i); 
      }
    }
    this.power = sum;
    return sum;
  }
  
  public static void AddtoVault(Artifact a)
  {
    if(count<4)
    {
      vault[count++] = a;
      System.out.println(a.creator + " added " + a.name + " successfully to the vault.");
    }
    else
    {
       System.out.println("!! " + a.creator + " unsuccessful in adding artifact to the vault!!");
    }
  }
  
  public void changeName(String newName)
  {
    this.name = newName;
    this.power = CalcPower();
    System.out.println("Name changed and power recalculated.");
    
    if(this.power > strongest.power)
    {
      strongest = this; 
    }
  }
  
  public void revealArtifact()
  {
    System.out.println(this.name + " added by " + this.creator + " has power of " + this.power);
  }
  
  public static void labReport()
  {
    System.out.println("=== Future Gadget Lab ===");
    for(int i = 0; i < count ; i++)
    {
      vault[i].revealArtifact();
    }
  }
  
  public static String strongest()
  {
    if(strongest == null)
    {
      return "None";
    }
    else
    {
      return strongest.name;
    }
  }
}