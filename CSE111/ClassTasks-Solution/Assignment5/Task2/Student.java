public class Student
{
  public static int total_students;
  public static double ttlMarks;
  private int CodingMarks;
  private int TracingMarks;
  public String name;
  public int id;
  
  public Student(String name)
  {
    total_students++;
    this.id = total_students;
    this.name = name;
  }
  
  public Student(String name, int co, int tr)
  {
    this(name);
    setCodingMarks(co);
    setTracingMarks(tr);
  }
  
  public void setCodingMarks(int c)
  {
    this.CodingMarks = c;
    ttlMarks += c;
  }
  
  public int getCodingMarks()
  {
    return this.CodingMarks; 
  }
  
  public void setTracingMarks(int c)
  {
    this.TracingMarks = c;
    ttlMarks += c;
  }
  
  public int getTracingMarks()
  {
    return this.TracingMarks; 
  }
  
  public static double averageMarks()
  {
    if(total_students == 0)
    {
      return 0.0; 
    }
    return ttlMarks/total_students;
  }
  
  public void individualDetail()
  {
     System.out.println("Name: " + this.name);
     System.out.println("ID: " + this.id);
     System.out.println("Coding Marks: " + getCodingMarks());
     System.out.println("Tracing Marks: " + getTracingMarks());
     
     int individualTtl = getCodingMarks()+getTracingMarks();
     if(individualTtl<50)
     {
       System.out.println(this.name + " has failed with " + individualTtl + " marks"); 
     }
     else
     {
       System.out.println(this.name + " has passed with " + individualTtl + " marks");
     }
  }
}