public class Triangle
{
  public int s1;
  public int s2;
  public int s3;
  public int peri;
  
  public Triangle(int a, int b, int c)
  {
     this.peri = a+b+c;
     this.s1 = a;
     this.s2 = b;
     this.s3 = c;
     
  }
  
  public void triangleDetails()
  {
    System.out.println("Three sides of the triangle are: " + this.s1 + ", " + this.s2 + ", " + this.s3);
    System.out.println("Perimeter: " + this.peri);
  }
  
  public String printTriangleType()
  {
    if(this.s1 == this.s2 && this.s2 == this.s3)
    {
      return "This is an Equilateral Triangle.";
    }
    else if(this.s1 == this.s2 || this.s2 == this.s3 || this.s1 == this.s3)
    {
      return "This is an Isosceles Triangle.";
    }
    else
    {
      return "This is a Scalene Triangle."; 
    }
  }
  
  public void compareTriangles(Triangle obj)
  {
     if(this == obj)
     {
       System.out.println("These two triangle objects have the same address.");  
     }
     else if(this.s1 == obj.s1 && this.s2 == obj.s2 && this.s3 == obj.s3)
     {
       System.out.println("Addresses are different but the sides of the triangles are equal.");
     }
     else if(this.peri == obj.peri)
     {
       System.out.println("Only the perimeter of both triangles is equal.");
     }
     else
     {
       System.out.println("Addresses, length of the sides and perimeter all are different.");
     }    
  }
}