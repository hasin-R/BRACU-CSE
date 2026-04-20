public class Borrower
{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  public String name;
  public String [] borrowedBooks = new String[10];
  public int count;
  
  public Borrower(String s)
  {
     this.name = s;
  }
  
  public static void bookStatus()
  {
    System.out.println("Available Books:");
    for(int i = 0; i < book_name.length; i++)
    {
      System.out.println(book_name[i] + ": " + book_count[i]); 
    }
  }
  
  public static int remainingBooks(String name)
  {
    for(int i = 0; i < book_name.length; i++)
    {
       if(book_name[i].equals(name))
       {
         return book_count[i];
       }
    }
    return 0;
  }
  
  public void borrowBook(String s)
  {
    int remaining = remainingBooks(s);
    if(remaining > 0)
    {
      for(int i = 0; i < book_name.length; i++)
      {
        if(book_name[i].equals(s))
        {
          book_count[i]--;
          borrowedBooks[count] = s;
          count++;
          break;
        }
      }
    }
    
    else
    {
      System.out.println("This book is not available."); 
    }
  }
  
  public void borrowerDetails()
  {
     System.out.println("Name: " + this.name);
     System.out.println("Books Borrowed:");
     for(int i = 0; i < this.count; i++)
     {
       System.out.println(this.borrowedBooks[i]);
     }
  }
}
