public class BracuStudent
{
  private String loc;
  public String name;
  public boolean pass;
  
  public BracuStudent(String name, String loc)
  {
    this.name = name;
    this.loc = loc;
  }
  
  public void collectPass()
  {
    this.pass = true;
  }
  
  public void setLocation(String loc)
  {
    this.loc = loc; 
  }
  
  public String getLoc()
  {
    return this.loc; 
  }
  
  public void showDetails()
  {
    System.out.println("Student Name: " + this.name);
    System.out.println("Lives in " + this.loc);
    System.out.println("Have Bus Pass? " + this.pass);
  }
}