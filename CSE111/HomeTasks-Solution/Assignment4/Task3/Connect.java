public class Connect
{
  public int totalAdvisee;
  public Student [] advisee = new Student[5];
  
  public Connect()
  {
    System.out.println("Connect is ready to use!");
  }
  
  public void login(Student obj)
  {
     if(obj.email == null || obj.getPassword() == null)
     {
       System.out.println("Email and password need to be set."); 
     }
     else
     {
       System.out.println("Login successful");
       obj.setLStatus(true);
     }
  }
  
  public void advising(Student obj)
  {
     if(!obj.getLStatus())
     {
       System.out.println("Please login to advise courses!"); 
     }
     else
     {
       System.out.println("You haven't selected any courses.");
     }
  }
  
  public void advising(Student obj, String c1, String c2, String c3, String c4)
  {
    System.out.println("You need special approval to take more than 3 courses.");
  }
  
  public void advising(Student obj, String c1, String c2, String c3)
  {
    if(!obj.getLStatus())
    {
      System.out.println("Please login to advise courses!");
      return;
    }
    
    obj.indx = 0;
    obj.cList[obj.indx++] = c1;
    obj.cList[obj.indx++] = c2;
    obj.cList[obj.indx++] = c3;
    System.out.println("Advising successful!");
    
    boolean alreadyExists = false;
    for( int i = 0; i<totalAdvisee; i++)
    {
      if(advisee[i] == obj)
      {
        alreadyExists = true;
        break;
      }
    }
    if(!alreadyExists && totalAdvisee<5)
    {
      advisee[totalAdvisee++] = obj;
    }
  }
  
  public void allAdviseeInfo()
  {
    System.out.println("Total Advisee: " + this.totalAdvisee);
    for(int i=0; i<totalAdvisee; i++)
    {
      System.out.println("Name: " + advisee[i].name + " ID: " + advisee[i].id);
      System.out.println("Department: " + advisee[i].dept);
      System.out.println("Advised Courses:");
      for(int j=0; j<advisee[i].indx; j++)
      {
        System.out.print(advisee[i].cList[j] + " ");
      }
      System.out.println();
      System.out.println("==============");
    }
    
  }
}