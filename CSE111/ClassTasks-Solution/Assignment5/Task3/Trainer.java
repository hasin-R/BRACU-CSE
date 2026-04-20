public class Trainer
{
  public String name;
  public Pokemon [] pList = new Pokemon[7];
  public int count;
  public static int trainerCount;
  public int id;
  public double totalHP;
  public double average;
  
  public Trainer(String name)
  {
    trainerCount++;
    this.id = trainerCount;
    this.name = name;
    System.out.println("Trainer ID: " + id + ", Name: " + name + " - created");
  }
  
  public void catchPokemon(Pokemon obj)
  {
    if(this.count<7)
    {
      pList[this.count++] = obj;
      System.out.println(this.name + " caught: " + obj.getName());
      this.totalHP += obj.getHP();
      this.average = this.totalHP/this.count;
    }
  }
  
  public void viewPokeDex()
  {
    System.out.println(this.name + "'s Trainer code: T" + this.id);
    for(int i = 0; i<this.count; i++)
    {
       System.out.println(pList[i].getName() + ": " + pList[i].getHP() + " points");
    }
    System.out.println("Average of HP: " + this.average);
  }
  
  public static void battle(Trainer t1, Trainer t2)
  {
     System.out.println("Battle Info");
     System.out.println(t1.name + "'s HP average: " + t1.average);
     System.out.println(t2.name + "'s HP average: " + t2.average);
     
     if(t1.average > t2.average)
     {
       System.out.println(t1.name + " wins");
     }
     else if(t2.average > t1.average)
     {
       System.out.println(t2.name + " wins");
     }
     else
     {
       System.out.println("It's a tie");
     }
  }
}