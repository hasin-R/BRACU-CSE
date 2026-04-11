public class Student
{
  private String pass;
  private boolean lStatus;
  public String email;
  public String name;
  public String dept;
  public int id;
  public String [] cList = new String[3];
  public int indx;
  
  public Student(String nm, int id, String dept)
  {
    this.name = nm;
    this.id = id;
    this.dept = dept;
    System.out.println("Student object is created");
  }
  
  public void setPassword(String pass)
  {
    this.pass = pass;
  }
  
  public String getPassword()
  {
    return this.pass; 
  }
  
  public void setLStatus(boolean status)
  {
    this.lStatus = status;
  }
  
  public boolean getLStatus()
  {
    return lStatus;
  }
}