public class Player
{
  public String name;
  public int hp;
  public int count;
  public String [] defeated = new String[5];
  
  public Player(String nm, int h)
  {
    this.name = nm;
    this.hp = h;
    System.out.println(this.name + " joined the game");
    System.out.println("HP: " + this.hp);
  }
  
  public Player(String nm)
  {
    this(nm,100); 
  }
  
  public void defeatVillain(String v, int x)
  {
     if(count<5)
     {
       if(this.hp<x)
       {
         System.out.println("failed to defeat " + v);
       }
       else
       {
         this.defeated[count++] = v;
         this.hp += x;
         System.out.println("defeated " + v); 
       }
     }
  }
  
  public void defeatVillain(char m, String v, int x)
  {
    hp *= (m-48);
    System.out.println("HP with " + m + "x boost: " + hp);
    defeatVillain(v,x);
  }
  
  public void defeatVillain(Player p)
  {
    defeatVillain(p.name, p.hp); 
  }
  
  public void viewInfo()
  {
    System.out.println("Player Name: " + this.name);
    System.out.println("Current HP: " + this.hp);
    if(this.count>0)
    {
      System.out.println("Defeated:");
      for(int i = 0; i < count; i++)
      {
        System.out.print(defeated[i] + ", "); 
      }
      System.out.println();
    }  
  }
}