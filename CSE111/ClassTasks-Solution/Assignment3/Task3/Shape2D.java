public class Shape2D
{
  public String shape;
  public double area;
  
  public Shape2D()
  {
    System.out.println("A Square has been created with length: 5");
    this.shape = "Square";
    this.area = 5*5;
  } 
  
  public Shape2D(int length, int breadth)
  {
    System.out.println("A Rectangle has been created with length: " + length + " and breadth: " + breadth);
    this.shape = "Rectangle";
    this.area = length*breadth;
  }
  
  public Shape2D(int height, int base, String shape)
  {
    System.out.println("A " + shape + " has been created with height: " + height + " and base: " + base);
    this.shape = shape;
    this.area = 0.5*base*height;
  }
  
  public Shape2D(int side1, int side2, int side3)
  {
    System.out.println("A Triangle has been created with the following sides: " + side1 + ", " + side2 + ", " + side3);
    this.shape = "Triangle";
    
    double s = (side1+side2+side3)/2.0;
    this.area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
  }
  
  public void area()
  {
     System.out.printf("The area of the %s is: %.2f\n", this.shape, this.area);
  }

}