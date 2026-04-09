//Task2
public class Cart
{
  public String [] item = new String[3];
  public double [] price = new double[3];
  public int itemCount;
  public double ttlPrice;
  public int cartNum;
  public double discount;
  
  public void create_cart(int n)
  {
    this.cartNum = n;
  }
  
  public void addItem(String item, double price)
  {
    if(itemCount<3)
    {
      this.item[itemCount] = item;
      this.price[itemCount] = price;
      this.ttlPrice += price;
      this.itemCount++; 
      System.out.println(item + " added to cart " + this.cartNum + ".");
      System.out.println("You have " + this.itemCount + " item(s) in your cart now.");
       
    }
    else
    {
      System.out.println("You already have 3 items on your cart"); 
    }
  }
  
  public void addItem(double price, String item)
  {
    addItem(item, price);
  }
  
  public void giveDiscount(double n)
  {
    this.discount = n;
    this.ttlPrice = (this.ttlPrice) - (this.ttlPrice*(this.discount/100));
  }
  
  public void cartDetails()
  {
    System.out.println("Your cart(c" + this.cartNum + ") :");
    for(int i = 0; i < this.itemCount; i++)
    {
      System.out.println(this.item[i] + " - " + this.price[i]); 
    }
    System.out.println("Discount Applied: " + this.discount + "%");
    System.out.println("Total price: " + this.ttlPrice);
  }
}