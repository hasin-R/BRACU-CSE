public class Animalkeepers
{
   private static int id = 101;
   public static String [] Animals = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
   public static String [] tasks = new String[Animals.length];
   public static String [] keepers = new String[Animals.length];
   public static int tCount;
   public static int kCount;
   
   public String keeper;
   
   public Animalkeepers(String s)
   {
      this.keeper = s;
      System.out.println(this.keeper + " with ID " + id + " got the job!");
      id++;
      kCount++;
   }
   
   public void doTask(String animal, String task)
   {
      boolean found = false;
      for(int i = 0; i < Animals.length; i++)
      {
        if(animal.equals(Animals[i]))
        {
          found = true;
          if(tasks[i] == null)
          {
            tCount++; 
          }
          tasks[i] = task;
          keepers[i] = this.keeper;
          System.out.println("Task assigned to " + this.keeper);
          break;
        }              
      }
     if(!found)
     {
        System.out.println("Animal not in the Safari");
     }
   }
   
   public static void printTasks()
   {
      if(tCount == 0)
      {
        System.out.println("No tasks assigned."); 
      }
      else
      {
        for(int i = 0; i < Animals.length; i++)
        {
          if(tasks[i] != null)
          {
            System.out.println(tasks[i] + " (keeper - " + keepers[i] + ") === " + Animals[i]); 
          }
        }
      }
   }
   
   public static void details()
   {
      if(kCount == 0)
      {
        System.out.println("No Animal keepers working yet."); 
      }
      else
      {
        System.out.println("Total Animal keeper: " + kCount);
        System.out.println("Total Task assigned: " + tCount);
        printTasks();
      }
   }
}