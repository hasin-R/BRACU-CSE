//Task3
public class Employee
{
  public String name;
  public double salary = 30000;
  public String designation = "junior";
  
  public void newEmployee(String s1)
  {
    name = s1;
  }
  
  public void displayInfo()
  {
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary + " Tk");
    System.out.println("Employee Designation: " + designation);
  }
  
  double tax;
  public void calculateTax()
  {
    if(salary > 50000)
    {
      tax = salary*0.3;
      System.out.println(name + " Tax Amount: " + tax + " Tk");
    }
    else if(salary > 30000)
    {
      tax = salary*0.1;
      System.out.println(name + " Tax Amount: " + tax + " Tk");
    }
    else
    {
      System.out.println("No need to pay tax");
    }
  }
  
  public void promoteEmployee(String s1)
  {
    if(s1.equals("senior"))
    {
      salary += 25000;
    }
    else if(s1.equals("lead"))
    {
      salary += 50000;
    }
    else if(s1.equals("manager"))
    {
      salary += 75000;
    }
    
    designation = s1;
    System.out.println(name + " has been promoted to " + s1);
    System.out.printf("New Salary: %.2f Tk\n" , salary);
  }
}