public class Product
{
   public String name;
   public int qty;
   public static int pCount;
   public static Product [] inventory = new Product[3];
   
   public Product(String name, int q)
   {
     if(pCount<3)
     {
       this.name = name;
       this.qty = q;
       inventory[pCount++] = this;
       System.out.println("Stored: " + name);
     }
     else
     {
       System.out.println("Storage is full! Cannot add " + name); 
     }
   }
   
   public static void buy(String s, int n)
   {
      boolean found = false;
      for(int i = 0; i < pCount; i++)
      {
        if(inventory[i].name.equals(s))
        {
          found = true;
          if(inventory[i].qty >= n)
          {
            inventory[i].qty -= n;
            System.out.println("Product Sold");
          }
          else
          {
            System.out.println("Quantity low");
          }
          break;
        }
      }
      if(!found)
      {
        System.out.println("Product not found"); 
      }
   }
   
   public static void displayProducts()
   {
      System.out.println("=== Stored Products ===");
      for(int i = 0; i < pCount; i++)
      {
        System.out.println(inventory[i].name + " - Qty: " + inventory[i].qty); 
      }
   }
}