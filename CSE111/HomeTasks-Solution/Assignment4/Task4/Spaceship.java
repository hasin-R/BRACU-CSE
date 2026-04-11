public class Spaceship
{
  public String name;
  public int capacity;
  public Cargo [] item = new Cargo[100];
  public int count;
  public int cWeight;
  
  public Spaceship(String name, int cap)
  {
    this.name = name;
    this.capacity = cap;
  }
  
  public void loadCargo(Cargo obj)
  {
    if(count<100 && this.cWeight+obj.getWeight() <= this.capacity)
    {  
      cWeight += obj.getWeight();
      item[count++] = obj; 
    }
    else
    {
      int exceed = obj.getWeight()- (this.capacity-this.cWeight);
      System.out.println("Warning: Unable to load " + obj.getName() + " inside " + this.name + ". Exceeds capacity by " + exceed + "."); 
    }
  }
  
  public void displayDetails()
  {
    System.out.println("Spaceship Name: " + this.name);
    System.out.println("Capacity: " + this.capacity);
    System.out.println("Current Cargo Weight: " + this.cWeight);
    System.out.print("Cargo:");
    for(int i = 0; i < this.count; i++)
    {
      System.out.print(" " + item[i].getName());
    }
    System.out.println();
  }
}