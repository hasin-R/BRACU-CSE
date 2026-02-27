//Task1
public class UniversityTester
{
  public static void main(String [] args)
  {
    //a
    University u1 = new University();
    University u2 = new University();
    
    System.out.println("Object 1 location: " + u1);
    System.out.println("Object 2 location: " + u2);
    
    System.out.println("u1 name: " + u1.name);
    System.out.println("u1 country: " + u1.country);
    System.out.println("u2 name: " + u2.name);
    System.out.println("u2 country: " + u2.country);
    
    //b
    u1.name = "Imperial College London";
    u1.country = "England";
    
    u2.name = "BRAC University";
    u2.country = "Bangladesh";
    
    System.out.println("u1 name: " + u1.name);
    System.out.println("u1 country: " + u1.country);
    System.out.println("u2 name: " + u2.name);
    System.out.println("u2 country: " + u2.country);
  }
}