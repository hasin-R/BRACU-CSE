public class Teacher
{
  public String name;
  public String init;
  public Course [] cList = new Course[3];
  public int count;
  
   public Teacher(String name, String init)
   {
     this.name = name;
     this.init = init;
     System.out.println("A new teacher has been created"); 
   }
   
   public void addCourse(Course obj)
   {
      if(this.count<3)
      {
        cList[this.count] = obj;
        count++;
      }
   }
   
   public void printDetail()
   {
     System.out.println("Name: " + this.name);
     System.out.println("Initial: " + this.init);
     System.out.println("List of courses:");
     for(int i = 0; i < this.count; i++)
     {
       System.out.println(cList[i].getCourseCode()); 
     }
   }
}