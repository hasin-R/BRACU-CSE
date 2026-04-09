public class Shape
{
  public String name;
  public double area;
  
  public void setParameters(String name, int r)
  {
    this.name = name;
    this.area = 3.1416*r*r;
  }
  
  public void setParameters(String name, int b, int h)
  {
    this.name = name;
    this.area = 0.5*b*h;
  }
  
  public void setParameters(String name, double l, double w)
  {
    this.name = name;
    this.area = l*w;
  }
  
  public String details()
  {
    return "Shape Name: " + this.name + "\nArea: " + this.area;
  }
}