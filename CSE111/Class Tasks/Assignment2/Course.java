//Task3
public class Course
{
  public String Name;
  public String Code;
  public int Credit;
  
  public void updateDetails(String s1, String s2, int n)
  {
    Name = s1;
    Code = s2;
    Credit = n;
  }
  
  public void displayCourse()
  {
    System.out.println("Course Name: " + Name);
    System.out.println("Course Code: " + Code);
    System.out.println("Course Credit: " + Credit);
  }
}